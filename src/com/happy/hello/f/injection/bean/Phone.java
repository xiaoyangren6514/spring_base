package com.happy.hello.f.injection.bean;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class Phone {
    private String name;
    private int version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
