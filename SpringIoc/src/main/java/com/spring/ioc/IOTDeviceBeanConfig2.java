package com.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig2 {

    @Bean(name = "firstBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IOTDevice2 firstIOTBean(){
        return new IOTDevice2();
    }

    @Bean(name = "secondBean", initMethod = "initBean", destroyMethod = "destroyBean")
    public IOTDevice2 secondIOTBean(){
        return new IOTDevice2();
    }

}
