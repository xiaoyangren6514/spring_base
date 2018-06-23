package com.happy.hello.f.injection.bean;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class Address {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
