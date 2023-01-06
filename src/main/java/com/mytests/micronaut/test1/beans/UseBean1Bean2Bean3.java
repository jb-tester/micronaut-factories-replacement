package com.mytests.micronaut.test1.beans;

import jakarta.inject.Named;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test1
 * *******************************
 */
public class UseBean1Bean2Bean3 {

    Bean1 bean1;
    Bean2 bean2;
    Bean3 bean3;

    public UseBean1Bean2Bean3(Bean1 bean1, Bean2 bean2, @Named("bean32") Bean3 bean3) {
        this.bean1 = bean1;
        this.bean2 = bean2;
    }

    public Bean2 getBean2() {
        return bean2;
    }

    public Bean1 getBean1() {
        return bean1;
    }

    public String getAll() {
        return bean1.getId() + " " + bean2.getId() + bean3.getId();
    }

    public void destroyMe() {

        System.out.println("bean2 is destroyed");
    }
}
