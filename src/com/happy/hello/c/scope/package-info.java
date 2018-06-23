/**
 * Created by zhonglongquan on 2018/6/21.
 */
package com.happy.hello.c.scope;

/*
 *  singleInstance:单例，在容器中只会被创建一份，默认，实际开发中，大部分使用默认值
 *  prototype:每次获取都会创建一份对象
 *      在于Struts2整合中，Action交给spring管理，Action在每次请求都要创建一份，此时要用多例
 *  request:创建对象，存在于request域
 *  session:创建对象，存在于session域
 *
 */