package com.zhoufy.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA by ChouFy on 2019/8/1.
 *
 * @author Zhoufy
 */
@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat(){
        System.out.println("cat constructor...");
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("cat...destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("cat...afterPropertiesSet...");
    }
}
