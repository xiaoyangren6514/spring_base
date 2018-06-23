package com.happy.hello.h.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zhonglongquan on 2018/6/22.
 */
@Component(value = "clothes2")
public class Clothes {
    @Value(value = "red")
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "color='" + color + '\'' +
                '}';
    }
}
