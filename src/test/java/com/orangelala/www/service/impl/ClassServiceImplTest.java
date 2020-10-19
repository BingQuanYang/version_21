package com.orangelala.www.service.impl;

import com.orangelala.www.utils.InterData;
import org.junit.Test;

/**
 * kun
 */
public class ClassServiceImplTest {
    ClassServiceImpl classService = new ClassServiceImpl();
    @Test
    public void obtainClassTest() {
        InterData interData = classService.obtainClass();
        System.out.println(interData);
    }
}
