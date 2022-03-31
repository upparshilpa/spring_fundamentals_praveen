package com.spring.ioc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig2.class);

        IOTDevice2 iotDevice1 = (IOTDevice2) applicationContext.getBean("firstBean");
        IOTDevice2 iotDevice2 = (IOTDevice2) applicationContext.getBean("secondBean");

        iotDevice1.setDevice("Fridge");
        iotDevice1.setDescription("Temperature gauge for the freezer");
        iotDevice2.setDevice("Dishwasher");
        iotDevice2.setDescription("Monitor");

        System.out.println(iotDevice1);
        System.out.println(iotDevice2);

        applicationContext.close();
    }
}
