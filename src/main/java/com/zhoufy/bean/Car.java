package com.zhoufy.bean;

import org.springframework.stereotype.Component;


/**
 * Created with IDEA by ChouFy on 2019/7/29.
 *
 * @author Zhoufy
 */
@Component
public class Car {

    public Car(){
        System.out.println("car constructor...");
    }

    public void init(){
        System.out.println("car ... init...");
    }

    public void detory(){
        System.out.println("car ... detory...");
    }

}
