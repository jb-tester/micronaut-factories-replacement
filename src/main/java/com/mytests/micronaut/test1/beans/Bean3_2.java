package com.mytests.micronaut.test1.beans;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *******************************
 * Created by irina on 12/26/2019.
 * Project: micronaut-test1
 * *******************************
 */
@Singleton
@Named("bean32")
public class Bean3_2 implements Bean3 {
    private String id="b32";

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(final String id) {
       this.id = id;
    }
}
