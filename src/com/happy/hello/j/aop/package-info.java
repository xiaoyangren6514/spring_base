/**
 * Created by zhonglongquan on 2018/6/22.
 * AOP：横向重复，纵向抽取
 * JoinPoint连接点：目标对象中，所有可以被增强的方法
 * PointCut切入点：目标对象中，已经被增强的方法
 * Advice通知/增强：增强的代码
 * Weaving织入：将通知应用到连接点，形成切入点
 * Proxy代理对象：织入完成后，形成的代理对象
 * Aspect切面：切入点+通知
 * Target目标对象：被代理对象
 */
package com.happy.hello.j.aop;