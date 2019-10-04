package com.stackroute;

import com.stackroute.configure.Appconfig;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Appconfig.class);
        context.refresh();

        Movie movie = context.getBean(Movie.class);

        BeanLifecycleDemoBean beanLifecycleDemoBean = (BeanLifecycleDemoBean)context.getBean(BeanLifecycleDemoBean.class);


        System.out.println(movie);



        context.close();
    }
}
