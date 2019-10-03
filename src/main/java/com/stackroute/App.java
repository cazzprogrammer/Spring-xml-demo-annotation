package com.stackroute;

import com.stackroute.configure.Appconfig;
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
        System.out.println("Actor name : " + movie.getActor().getName());
        System.out.println("Actor gender : " + movie.getActor().getGender());
        System.out.println("Actor age : " + movie.getActor().getAge());
        context.close();
    }
}
