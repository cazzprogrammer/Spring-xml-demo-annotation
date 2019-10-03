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

        Movie movie1 = context.getBean("MovieA",Movie.class);
        Movie movie2 = context.getBean("MovieB",Movie.class);

        System.out.println(movie1 == movie2);




        context.close();
    }
}
