package com.test;

import com.zhoufy.config.ExtConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IDEA by ChouFy on 2019/7/31.
 *
 * @author Zhoufy
 */
public class IOCTestExt {


    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);


        //发布事件；
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
        });

        applicationContext.close();
    }
}
