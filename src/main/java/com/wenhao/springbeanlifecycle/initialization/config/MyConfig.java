package com.wenhao.springbeanlifecycle.initialization.config;


import com.wenhao.springbeanlifecycle.initialization.domain.Code001;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(Code001.class)
public class MyConfig {


}
