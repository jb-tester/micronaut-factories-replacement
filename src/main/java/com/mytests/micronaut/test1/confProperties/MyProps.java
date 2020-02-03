package com.mytests.micronaut.test1.confProperties;

import io.micronaut.context.annotation.ConfigurationProperties;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test1
 * *******************************
 */
@ConfigurationProperties("myprops")
public class MyProps {
    String b11;
    String b12;
    String b21;
    String b22;

    public String getB11() {
        return b11;
    }

    public void setB11(String b11) {
        this.b11 = b11;
    }

    public String getB12() {
        return b12;
    }

    public void setB12(String b12) {
        this.b12 = b12;
    }

    public String getB21() {
        return b21;
    }

    public void setB21(String b21) {
        this.b21 = b21;
    }

    public String getB22() {
        return b22;
    }

    public void setB22(String b22) {
        this.b22 = b22;
    }
}
