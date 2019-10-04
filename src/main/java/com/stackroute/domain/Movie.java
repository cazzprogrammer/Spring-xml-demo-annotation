package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    private Actor getActor;


    public Movie(Actor getActor)
    {
        this.getActor = getActor;
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
}
