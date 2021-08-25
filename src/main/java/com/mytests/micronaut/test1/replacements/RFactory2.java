package com.mytests.micronaut.test1.replacements;

import com.mytests.micronaut.test1.beans.Bean2;
import com.mytests.micronaut.test1.beans.Bean2_1;
import com.mytests.micronaut.test1.beans.Bean2_2;
import com.mytests.micronaut.test1.factories.Factory2;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.context.annotation.Value;
import jakarta.inject.Named;
import jakarta.inject.Singleton;


/**
 * *******************************
 * Created by irina on 12/26/2019.
 * Project: micronaut-test1
 * *******************************
 */
@Factory
@Replaces(factory = Factory2.class)
public class RFactory2 {

    @Singleton
    @Named("bean21")
    public Bean2 bean21(@Value(value = "replaced bean21") String id) {
        Bean2 b2 = new Bean2_1();
        b2.setId(id);
        return b2;
    }

    @Singleton
    @Named("bean22")
    public Bean2 bean22(@Value(value = "replaced bean22") String id) {
        Bean2 b2 = new Bean2_2();
        b2.setId(id);
        return b2;
    }
}
