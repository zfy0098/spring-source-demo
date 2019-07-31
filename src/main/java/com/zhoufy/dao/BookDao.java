package com.zhoufy.dao;


import org.springframework.stereotype.Repository;

/**
 * Created with IDEA by ChouFy on 2019/7/31.
 *
 * @author Zhoufy
 */
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao [lable=" + lable + "]";
    }


}
