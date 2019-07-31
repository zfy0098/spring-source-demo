package com.zhoufy;

/**
 * @author zhoufy
 */
public class TestBean {


    private String content = "test str content";

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }



    public void init(){
        System.out.println("TestBean init method..........");
    }

    public void destroy(){
        System.out.println("TestBean destroy method..........");
    }

}
