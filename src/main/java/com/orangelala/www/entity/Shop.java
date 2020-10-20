package com.orangelala.www.entity;

public class Shop {
    private String id;
    private String p_id;
    private double unit_price;
    private int number;
    private int u_id;
    private int is_available;

    public Shop() {
    }

    public Shop(String id, String p_id, double unit_price, int number, int u_id, int is_available) {
        this.id = id;
        this.p_id = p_id;
        this.unit_price = unit_price;
        this.number = number;
        this.u_id = u_id;
        this.is_available = is_available;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_id() {
        return p_id;
    }

    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getIs_available(int is_available) {
        return this.is_available;
    }

    public void setIs_available(int is_available) {
        this.is_available = is_available;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id='" + id + '\'' +
                ", p_id='" + p_id + '\'' +
                ", unit_price=" + unit_price +
                ", number=" + number +
                ", u_id=" + u_id +
                ", is_available=" + is_available +
                '}';
    }

}


