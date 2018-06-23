package com.happy.hello.j.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by zhonglongquan on 2018/6/23.
 * 前置通知
 * 后置通知(出现异常不会调用)
 * 环绕通知
 * 异常通知
 * 后置通知(出现异常也会调用)
 */
public class MyAdvice {

    public void before() {
        System.out.println("这是前置通知");
    }

    public void afterReturing() {
        System.out.println("这是后置通知，出现异常不会调用");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知前");
        Object proceed = pjp.proceed();
        System.out.println("环绕通知后");
        return proceed;
    }

    public void afterException() {
        System.out.println("出现异常拉");
    }

    public void after() {
        System.out.println("这是后置通知，出现异常也会调用");
    }

}
