package com.mytests.micronaut.test1;

import io.micronaut.core.async.annotation.SingleResult;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test1
 * *******************************
 */
@Client("/")
public interface MyClient1 {

    @Get
    @SingleResult
    Publisher<String> home();

}
