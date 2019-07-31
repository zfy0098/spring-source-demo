package com.zhoufy.ext;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA by ChouFy on 2019/7/31.
 *
 * @author Zhoufy
 */
@Service
public class ApplicationService {

    @EventListener(classes={ApplicationEvent.class})
    public void listen(ApplicationEvent event){
        System.out.println("ApplicationService。。监听到的事件："+event);
    }

}

