package com.orangelala.www.utils;

import com.orangelala.www.entity.Category;
import com.orangelala.www.entity.Classification;
import com.orangelala.www.entity.Headlines;
import com.orangelala.www.entity.Information;

import java.util.List;

public class HomeData {
    private List<Classification> classes;
    private List<Information> seckill;
    private List<Headlines> headlines;
    private List<Information> information;
    private List<Category> categories;
    private List<Information> information1;
    private List<Category> categories1;

    public List<Information> getInformation1() {
        return information1;
    }

    public void setInformation1(List<Information> information1) {
        this.information1 = information1;
    }

    public List<Category> getCategories1() {
        return categories1;
    }

    public void setCategories1(List<Category> categories1) {
        this.categories1 = categories1;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Information> getInformation() {
        return information;
    }

    public void setInformation(List<Information> information) {
        this.information = information;
    }

    public List<Headlines> getHeadlines() {
        return headlines;
    }

    public void setHeadlines(List<Headlines> headlines) {
        this.headlines = headlines;
    }

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

