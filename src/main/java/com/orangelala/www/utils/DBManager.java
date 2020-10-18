package com.orangelala.www.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBManager {
    private static volatile DBManager instance = null;
    private static DataSource ds;
    public static final String DB_PROPERTIES_NAME = "jdbc.properties";

    public DBManager() {

    }

    static {
        try {
            InputStream resourceAsStream = DBManager.class.getClassLoader().getResourceAsStream(DB_PROPERTIES_NAME);
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            System.out.println("创建数据库连接池失败");
        }
    }

    public static DBManager getInstance() {
        if (instance == null) {
            synchronized (DBManager.class) {
                if (instance == null) {
                    instance = new DBManager();
                }
            }
        }
        return instance;
    }

    /**
     * 初始化Connection
     */
    private static Connection initConnection() {
        Connection  connection = null;
        try {
            connection = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 释放资源
     * @param closeables
     */
    private static void close(AutoCloseable... closeables){
        for (AutoCloseable closeable :closeables){
            try {
                if(closeable != null) closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 更新操作 曾删改
     * @param sql   sql语句
     * @param obj   占位符参数
     * @return      影响行数
     */
    public static Integer commonUpdate(String sql,Object ... obj){
        Connection connection = null;
        PreparedStatement ps = null;
        int rSet = 0;
        try {
            connection = initConnection();
            ps = connection.prepareStatement(sql);
            //给占位符赋值
            for (int i = 0;i < obj.length;i++){
                ps.setObject(i+1,obj[i]);
            }
            //执行sql语句返回影响行数
            rSet = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(ps,connection);
        }
        return rSet;
    }

    /**
     * 查询多条记录
     * @param sql      sql语句
     * @param clazz     反射对象
     * @param obj       占位符的参数
     * @param <T>       通过传进来反射对象生成的对象类型
     * @return          list集合
     */
    public static <T> List<T> selectList(String sql, Class<T> clazz, Object ... obj) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<T> list = new ArrayList<>();
        try {
            connection = initConnection();
            ps = connection.prepareStatement(sql);
            //给占位符赋值
            if(obj != null){
                for (int i = 0;i < obj.length;i++){
                    ps.setObject(i+1,obj[i]);
                }
            }
            rSet = ps.executeQuery();
            while(rSet.next()){
                //创建对象
                T t = clazz.newInstance();
                //1.通过反射对象获取所有属性对象
                Field[] fields = clazz.getDeclaredFields();
                for (Field field :fields){
                    //2.取消访问权限
                    field.setAccessible(true);
                    //3.获取属性名
                    String name = null;
                    Column c = field.getAnnotation(Column.class);
                    if(c!=null && !"".equals(c.value())){
                        name = c.value();
                    }else {
                        name = field.getName();
                    }
                    //4.通过属性名当成字段名获取字段数据
                    Object value = rSet.getObject(name);
                    //5.给对象中的属性赋值
                    field.set(t,value);
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            close(rSet,ps,connection);
        }
        return list;
    }

    /**
     * 查询一条记录
     * @param sql   sql语句
     * @param clazz 反射对象
     * @param obj    占位符参数
     * @param <T>     通过传进来反射对象生成的对象类型
     * @return      通过传进来反射对象生成的对象
     */
    public static <T> T selectOne(String sql, Class<T> clazz, Object ... obj) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        List<T> list = new ArrayList<>();
        T t = null;
        try {
            connection = initConnection();
            ps = connection.prepareStatement(sql);
            //给占位符赋值
            if(obj != null){
                for (int i = 0;i < obj.length;i++){
                    ps.setObject(i+1,obj[i]);
                }
            }
            rSet = ps.executeQuery();
            if(rSet.next()){
                //创建对象
                t = clazz.newInstance();
                //1.通过反射对象获取所有属性对象
                Field[] fields = clazz.getDeclaredFields();
                for (Field field :fields){
                    //2.取消访问权限
                    field.setAccessible(true);
                    //3.获取属性名
                    String name = null;
                    Column c = field.getAnnotation(Column.class);
                    if(c!=null && !"".equals(c.value())){
                        name = c.value();
                    }else {
                        name = field.getName();
                    }
                    //4.通过属性名当成字段名获取字段数据
                    Object value = rSet.getObject(name);
                    //5.给对象中的属性赋值
                    field.set(t,value);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            close(rSet,ps,connection);
        }
        return t;
    }

    /**
     * 查询总数并返回
     * @param sql   sql语句
     * @return   总数
     */
    public static Integer selectCount(String sql){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rSet = null;
        int count = 0;
        try {
            connection = initConnection();
            ps = connection.prepareStatement(sql);
            rSet = ps.executeQuery();
            if(rSet.next()){
                count = rSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(rSet,ps,connection);
        }
        return count;
    }
}
