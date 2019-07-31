package com.test;

import com.zhoufy.tx.TxConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IDEA by ChouFy on 2019/7/30.
 *
 * @author Zhoufy
 */
public class IOCTestTx {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TxConfig.class);


        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : beanDefinitionNames){
            System.out.println(beanName);
        }
//        UserService userService = applicationContext.getBean(UserService.class);
//
//        userService.insertUser();
        applicationContext.close();
    }

}
