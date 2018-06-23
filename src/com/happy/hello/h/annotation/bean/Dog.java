package com.happy.hello.h.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by zhonglongquan on 2018/6/22.
 */
// 通过component把当前类放入spring容器中
@Component(value = "dog")
// 指定对象的作用域
@Scope(scopeName = "prototype")
public class Dog {

    @Autowired
    @Qualifier(value = "clothes2")
    private Clothes clothes;

    @Resource(name = "clothes")
    private Clothes clothes3;

    private String name;
    @Value(value = "12")
    private int age;

    public String getName() {
        return name;
    }

    @Value("逗哏")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @PostConstruct
    public void init() {
        System.out.println("dog init");
    }

    @PreDestroy
    private void destory() {
        System.out.println("dog destory");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "clothes=" + clothes +
                ", clothes3=" + clothes3 +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
