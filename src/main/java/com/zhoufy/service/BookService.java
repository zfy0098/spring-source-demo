package com.zhoufy.service;

import com.zhoufy.dao.BookDao;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA by ChouFy on 2019/7/31.
 *
 * @author Zhoufy
 */
@Service
public class BookService {

    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService [bookDao=" + bookDao + "]";
    }
}
