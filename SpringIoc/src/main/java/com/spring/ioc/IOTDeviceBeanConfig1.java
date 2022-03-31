package com.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig1 {

    @Bean
    public IOTDevice1 IOTDeviceBean(){
        return new IOTDevice1();
    }

    @Bean(name = "SomeBean")
    public IOTDevice1 newBeanHere(){
        return new IOTDevice1();
    }

}
