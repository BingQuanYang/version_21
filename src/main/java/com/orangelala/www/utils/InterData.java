package com.orangelala.www.utils;

import com.orangelala.www.entity.Classification;

import java.util.List;

/**
 * kun
 */
public class InterData {
    private List<Classification> classes;

    public List<Classification> getClasses() {
        return classes;
    }

    public void setClasses(List<Classification> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "InterData{" +
                "classes=" + classes +
                '}';
    }
}
