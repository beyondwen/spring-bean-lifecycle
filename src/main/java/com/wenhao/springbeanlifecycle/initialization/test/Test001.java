package com.wenhao.springbeanlifecycle.initialization.test;


import com.wenhao.springbeanlifecycle.initialization.config.MyConfig;
import com.wenhao.springbeanlifecycle.initialization.domain.Code001;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Test001 {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            log.info(beanDefinitionName);
        }
        //Code001 code001 = (Code001) applicationContext.getBean("com.wenhao.springbeanlifecycle.initialization.Code001");
        //Code001 code001 = (Code001) applicationContext.getBean("com.wenhao.springbeanlifecycle.initialization.domain.Code001");
        //System.out.println(code001);
        Code001 code001 = (Code001) applicationContext.getBean("code001");
        System.out.println(code001);
        //code001.destroy();
        //applicationContext.
    }
}
