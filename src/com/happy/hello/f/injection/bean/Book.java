package com.happy.hello.f.injection.bean;

/**
 * Created by zhonglongquan on 2018/6/21.
 * 通过P命名空间注入
 */
public class Book {

    private String name;
    private Address address;

    public Book(String name, Address address) {
        this.name = name;
        this.address = address;
        System.out.println("book constructor called");
    }

    public Book(Address address, String name) {
        this.name = name;
        this.address = address;
        System.out.println("book constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
