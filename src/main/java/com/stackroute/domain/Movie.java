package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie  implements ApplicationContextAware , BeanFactoryAware, BeanNameAware {

    private Actor getActor;

    @Autowired
    public Movie(Actor actor)
    {
        this.getActor = actor;
    }


    public void setActor(Actor getActor)
    {
        this.getActor = getActor;
    }

    public Actor getActor() {
        return getActor;
    }

    @Override
    public String toString()
    {
        return "Movie :" + getActor;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean : " + s);
    }
}
