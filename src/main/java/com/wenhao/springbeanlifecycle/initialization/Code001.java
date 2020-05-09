package com.wenhao.springbeanlifecycle.initialization;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Code001{

    public Code001() {
        log.info("生成对象");
    }

    //第一种初始化方法
    private void initMethod() {
        log.info("初始化对象");
    }

    private void destroyMethod() {
        log.info("销毁对象");
    }

    /*
    第二种初始化和销毁方法
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("初始化对象");
    }

    @Override
    public void destroy() throws Exception {
        log.info("销毁对象");
    }*/
}
