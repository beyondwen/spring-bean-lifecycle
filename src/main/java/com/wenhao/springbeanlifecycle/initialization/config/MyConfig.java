package com.wenhao.springbeanlifecycle.initialization.config;


import com.wenhao.springbeanlifecycle.initialization.domain.Code001;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {

    @Bean(initMethod = "initMethod" ,destroyMethod = "destroyMethod")
    public Code001 code001(){
        return new Code001();
    }

}
