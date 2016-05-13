package com.brianway.learning.spring.ioc.example;


import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Brian on 2016/5/12.
 */
public class TestClassLoader {
    @Test
    public void testClassLoader(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("current loader: "+ loader);
        System.out.println("parent loader: "+ loader.getParent());
        System.out.println("grandparent loader: "+ loader.getParent().getParent());
        assertNull(loader.getParent().getParent());
    }
}
