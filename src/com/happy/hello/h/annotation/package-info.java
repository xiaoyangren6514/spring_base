/**
 * Created by zhonglongquan on 2018/6/22.
 * 使用注解配置spring
 * 1. 引入命名空间约束
 * xmlns:context="http://www.springframework.org/schema/context"
 * 2. 开启使用注解代理配置文件
 * 3. 在类中使用注解完成配置
 *      Component
 *      Service service层
 *      Controller web层 Action
 *      Repository dao层
 *      Scope 指定作用于
 *      Value  可以放到成员变量    通过反射对field字段进行赋值，破坏对象的封装性
 *             也可以放到set方法上 调用方法进行赋值，推荐
 *      Autowired 引用类型，自动装配
 *                  如果在容器中，存在多个同样对象(eg. 通过xml再生成一个bean)，装配选择问题
 *                  如果匹配到多个类型一致的对象，无法自动选择注入哪个
 *                  可以通过Qualifier，指定选择容器中的哪个对象
 *      Resource  引用类型，通过name指定装配哪个对象
 *      PostConstruct 初始化调用
 *      PreDestory    销毁时调用
 *
 */
package com.happy.hello.h.annotation;