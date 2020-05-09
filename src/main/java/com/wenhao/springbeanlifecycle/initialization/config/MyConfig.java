package com.wenhao.springbeanlifecycle.initialization.config;

import com.wenhao.springbeanlifecycle.initialization.Code001;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(Code001.class)
public class MyConfig {


    //第一种初始化方法
    /*@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Code001 code001() {
        return new Code001();
    }*/
}
