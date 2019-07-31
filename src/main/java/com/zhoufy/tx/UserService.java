package com.zhoufy.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IDEA by ChouFy on 2019/7/30.
 *
 * @author Zhoufy
 */


@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(rollbackFor = Exception.class)
    public void insertUser() {
        userDao.insert();
        //otherDao.other();xxx
        System.out.println("保存成功.....");
        int i = 10 / 0;
    }

}

