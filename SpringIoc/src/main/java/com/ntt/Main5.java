package com.ntt;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args) {

        /* here both the beans are pointing to one instance only, in order to resolve this issue we use the code below this comment.

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext1.xml");

        IOTDevice1 myIOTDeviceBean1 = appContext.getBean("myIOTDeviceBean1",IOTDevice1.class);
        IOTDevice1 myIOTDeviceBean2 = appContext.getBean("myIOTDeviceBean1", IOTDevice1.class);

        myIOTDeviceBean1.setDevice("Fridge");
        myIOTDeviceBean1.setDescription("Temperature gauge for the freezer");

        myIOTDeviceBean2.setDevice("Dishwasher");
        myIOTDeviceBean2.setDescription("Monitor water flow");

        System.out.println("ApplicationContext cast to BeanFactory:: " + myIOTDeviceBean1);
        System.out.println("ApplicationContext cast to BeanFactory:: " + myIOTDeviceBean2);

         */

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        IOTDevice1 myIOTDeviceBean1 = appContext.getBean("myIOTDeviceBean1",IOTDevice1.class);
        IOTDevice1 myIOTDeviceBean2 = appContext.getBean("myIOTDeviceBean2", IOTDevice1.class);

        myIOTDeviceBean1.setDevice("Fridge");
        myIOTDeviceBean1.setDescription("Temperature gauge for the freezer");

        myIOTDeviceBean2.setDevice("Dishwasher");
        myIOTDeviceBean2.setDescription("Monitor water flow");

        System.out.println("ApplicationContext cast to BeanFactory:: " + myIOTDeviceBean1);
        System.out.println("ApplicationContext cast to BeanFactory:: " + myIOTDeviceBean2);

    }
}
