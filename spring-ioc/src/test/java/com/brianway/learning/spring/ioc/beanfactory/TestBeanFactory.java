package com.brianway.learning.spring.ioc.beanfactory;

import com.brianway.learning.spring.ioc.reflect.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Brian on 2016/5/12.
 */
public class TestBeanFactory {

    /**
     * Springs XmlBeanFactory is deprecated
     * http://stackoverflow.com/questions/5231371/springs-xmlbeanfactory-is-deprecated
     */
    @Test
    public void testApplicationContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanfactory/beans.xml");
        Car car = (Car) context.getBean("car1");
        car.introduce();
    }


}
