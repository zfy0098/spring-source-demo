package com.zhoufy.service;


import org.springframework.stereotype.Service;

/**
 * Created with IDEA by ChouFy on 2019/8/7.
 *
 * @author Zhoufy
 */
@Service
public class BServiceImpl implements IService {

    @Override
    public void out() {
        System.out.println(this.getClass());
    }
}
