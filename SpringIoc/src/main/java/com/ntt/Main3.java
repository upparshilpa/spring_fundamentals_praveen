package com.ntt;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BeanFactory beanFactory = appContext;

        IOTDevice myDeviceBean = (IOTDevice) beanFactory.getBean("myIOTDeviceBean");

        System.out.println("ApplicationContext cast to BeanFactory:: " + myDeviceBean);

    }
}
