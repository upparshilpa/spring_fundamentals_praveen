package com.spring.ioc;


import com.ntt.IOTDevice1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);

        IOTDevice iotDevice = applicationContext.getBean(IOTDevice.class);

        iotDevice.setDevice("Fridge");
        iotDevice.setDescription("Temperature gauge for the freezer");

        System.out.println(iotDevice);


    }
}
