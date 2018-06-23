package com.happy.hello.k.aopannotion.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by zhonglongquan on 2018/6/23.
 * 前置通知
 * 后置通知(出现异常不会调用)
 * 环绕通知
 * 异常通知
 * 后置通知(出现异常也会调用)
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.happy.hello.k.aopannotion.service.*ServiceImpl.*(..))")
    public void pc(){}

    @Before("MyAdvice.pc()")
    public void before() {
        System.out.println("这是前置通知");
    }

    @AfterReturning("execution(* com.happy.hello.k.aopannotion.service.*ServiceImpl.*(..))")
    public void afterReturing() {
        System.out.println("这是后置通知，出现异常不会调用");
    }

    @Around("execution(* com.happy.hello.k.aopannotion.service.*ServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知前");
        Object proceed = pjp.proceed();
        System.out.println("环绕通知后");
        return proceed;
    }

    @AfterThrowing("execution(* com.happy.hello.k.aopannotion.service.*ServiceImpl.*(..))")
    public void afterException() {
        System.out.println("出现异常拉");
    }

    @After("execution(* com.happy.hello.k.aopannotion.service.*ServiceImpl.*(..))")
    public void after() {
        System.out.println("这是后置通知，出现异常也会调用");
    }

}
