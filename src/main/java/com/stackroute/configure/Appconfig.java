package com.stackroute.configure;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.stackroute.domain.Actor;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan("com.stackroute.domain")
public class Appconfig {

    @Bean
    public Actor getActor()
    {
        Actor actor = new Actor("Dipankar","Male",23);
        return actor;
    }



    @Bean({"MovieA","MovieB"})
    @Scope("prototype")
    public Movie movie()
    {
        Movie movie = new Movie(getActor());
        return movie;
    }

}
