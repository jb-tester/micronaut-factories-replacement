package com.mytests.micronaut.test1.replacements;

import com.mytests.micronaut.test1.beans.Bean3;
import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Singleton;


/**
 * *******************************
 * Created by irina on 12/26/2019.
 * Project: micronaut-test1
 * *******************************
 */
@Singleton
@Replaces(bean = Bean3.class, named = "bean32")
public class RBean3 implements Bean3{

    private String id;

    @Override
    public String getId() {
        setId("bean32");
        return id;
    }

    @Override
    public void setId(final String id) {
      this.id = "replaced "+id;
    }
}
