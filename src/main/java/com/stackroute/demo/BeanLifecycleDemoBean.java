package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertyset");
    }


    public void customInit()
    {
        System.out.println("Inside CustomInit");
    }
    public void customDestroy()
    {
        System.out.println("Inside Custom Destroy. Oh My GOd . Don't Destroy me please");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside Destroyer");
    }
}
