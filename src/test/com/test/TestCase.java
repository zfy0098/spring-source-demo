package com.test;

import com.zhoufy.service.IService;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created with IDEA by ChouFy on 2019/7/30.
 *
 * @author Zhoufy
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:*.xml"})
public class TestCase {


    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        System.out.println("开始遍历 beanName : ");
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }


    @Autowired
    private IService bService;

    @Test
    public void Test(){
        System.out.print(bService);
        bService.out();
    }
}
