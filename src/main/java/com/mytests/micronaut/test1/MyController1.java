package com.mytests.micronaut.test1;

import com.mytests.micronaut.test1.beans.UseBean1Bean2Bean3;
import com.mytests.micronaut.test1.confProperties.MyProps;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;


/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test1
 * *******************************
 */
@Controller
public class MyController1 {

    @Inject
    MyProps myProps;
    @Inject
    UseBean1Bean2Bean3 useBean1Bean2Bean3;


    @Get(uri = "/")
    public String home(){
        System.out.println(myProps.getB11());
        return useBean1Bean2Bean3.getAll();
    }
}
