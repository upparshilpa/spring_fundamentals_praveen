package com.spring.ioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig1.class);

//        IOTDevice1 iotDevice = applicationContext.getBean(IOTDevice1.class);

        IOTDevice1 iotDevice = (IOTDevice1) applicationContext.getBean("SomeBean");

        iotDevice.setDevice("Fridge");
        iotDevice.setDescription("Temperature gauge for the freezer");

        System.out.println(iotDevice);


    }
}
