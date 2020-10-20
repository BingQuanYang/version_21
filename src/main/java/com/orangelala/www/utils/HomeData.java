package com.orangelala.www.utils;

import com.orangelala.www.entity.Classification;
import com.orangelala.www.entity.Information;

import java.util.List;

public class HomeData {
    private List<Classification> classes;
    private List<Information> seckill;

    public List<Classification> getClasses() {
        return classes;
    }

    public void setClasses(List<Classification> classes) {
        this.classes = classes;
    }

    public List<Information> getSeckill() {
        return seckill;
    }

    public void setSeckill(List<Information> seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "HomeData{" +
                "classes=" + classes +
                ", seckill=" + seckill +
                '}';
    }
}

