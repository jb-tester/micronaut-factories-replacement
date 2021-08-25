package com.mytests.micronaut.test1.factories;

import com.mytests.micronaut.test1.beans.Bean2;
import com.mytests.micronaut.test1.beans.Bean2_1;
import com.mytests.micronaut.test1.beans.Bean2_2;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Value;
import jakarta.inject.Named;
import jakarta.inject.Singleton;


/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test1
 * *******************************
 */
@Factory
public class Factory2 {

    @Singleton
    public Bean2 bean21(@Value(value = "${myprops.b21}")String id){
        Bean2 b2 = new Bean2_1();
        b2.setId(id);
        return b2;
    }
    @Singleton @Named("bean22")
    public Bean2 bean22(@Value(value = "${myprops.b22}")String id){
        Bean2 b2 = new Bean2_2();
        b2.setId(id);
        return b2;
    }
}
