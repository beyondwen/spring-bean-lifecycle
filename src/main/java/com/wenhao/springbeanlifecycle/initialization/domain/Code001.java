package com.wenhao.springbeanlifecycle.initialization.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


@Slf4j
public class Code001 implements InitializingBean, DisposableBean {

    public Code001() {
        log.info("生成对象");
    }

    //第二种初始化和销毁方法
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("初始化对象");
    }

    @Override
    public void destroy() throws Exception {
        log.info("销毁对象");
    }
}
