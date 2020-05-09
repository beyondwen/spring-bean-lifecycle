package com.wenhao.springbeanlifecycle.initialization.domain;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Code001 {

    public Code001() {
        log.info("生成对象");
    }


    private void initMethod() {
        log.info("初始化对象");
    }

    private void destroyMethod() {
        log.info("销毁对象");
    }
}
