package com.mytests.micronaut.test1.factories;

import com.mytests.micronaut.test1.beans.*;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Primary;
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
public class Factory1 {

    @Singleton
    @Primary
    public Bean1 bean11(@Value(value = "${myprops.b11}")String id) {
        Bean1 bean1_1 = new Bean1_1();
        bean1_1.setId(id);
        return bean1_1;
    }
    @Singleton
    public Bean1 bean12(@Value(value = "${myprops.b12}")String id) {
        Bean1 bean1_2 = new Bean1_2();
        bean1_2.setId(id);
        return bean1_2;
    }

    @Bean(preDestroy = "destroyMe")     // todo: support preDestroy attr completion, validation etc
    // should navigate to the named bean only for b2
    // and to primary bean only for b1
    public UseBean1Bean2Bean3 bean2(Bean1 b1, @Named("bean22") Bean2 b2, @Named("bean32") Bean3 b3) {
        return new UseBean1Bean2Bean3(b1, b2, b3);
    }
}
