package com.happy.hello.f.injection;

import com.happy.hello.f.injection.bean.Book;
import com.happy.hello.f.injection.bean.Koko;
import com.happy.hello.f.injection.bean.Phone;
import com.happy.hello.f.injection.bean.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class PropertyInjectTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/happy/hello/f/injection/applicationContext.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher.getName() + "," + teacher.getAge() + "," + teacher.getAddress().getCity());

        System.out.println("********************");
        Book book = applicationContext.getBean(Book.class);
        System.out.println(book.toString());

        System.out.println("********************");
        Phone phone = applicationContext.getBean(Phone.class);
        System.out.println(phone.toString());

        System.out.println("********************");
        Koko koko = applicationContext.getBean(Koko.class);
        System.out.println(koko.getName());
    }
}
