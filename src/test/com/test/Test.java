package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA by ChouFy on 2019/7/30.
 *
 * @author Zhoufy
 */
public class Test {


    @org.junit.Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        System.out.println("开始遍历 beanName : ");
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }

}
