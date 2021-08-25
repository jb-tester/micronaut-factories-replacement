package com.mytests.micronaut.test1.beans;


import jakarta.inject.Singleton;

/**
 * *******************************
 * Created by irina on 12/26/2019.
 * Project: micronaut-test1
 * *******************************
 */
@Singleton
public class Bean3_1 implements Bean3 {
    private String id = "b31";

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(final String id) {
       this.id = id;
    }
}
