package com.mytests.micronaut.test1.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test1
 * *******************************
 */
public class UseBean1Bean2 {

    Bean1 bean1;
    Bean2 bean2;

    public UseBean1Bean2(Bean1 bean1, Bean2 bean2) {
        this.bean1 = bean1;
        this.bean2 = bean2;
    }

    public Bean2 getBean2() {
        return bean2;
    }

    public Bean1 getBean1() {
        return bean1;
    }

    public String getBoth(){
        return bean1.getId()+" "+bean2.getId();
    }
    public void destroyMe(){

        System.out.println("bean2 is destroyed");
    }
}
