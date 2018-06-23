package com.happy.hello.l.jdbc;

import com.happy.hello.l.jdbc.dao.UserDaoImpl;
import com.happy.hello.l.jdbc.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhonglq on 2018/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/happy/hello/l/jdbc/applicationContext.xml")
public class JdbcTest {

    @Resource(name = "userDao")
    private UserDaoImpl userDao;

    @Test
    public void testAdd() {
        User user = new User();
        user.setName("xiaofei");
        userDao.add(user);
    }

    @Test
    public void testDelete() {
        userDao.delete(1);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(2);
        user.setName("daaqiang");
        userDao.update(user);
    }

    @Test
    public void testFindById() {
        User user = userDao.findById(2);
        System.out.println(user.toString());
    }

    @Test
    public void testFindAll() {
        List<User> userList = userDao.findAll();
        System.out.println(userList.toString());
    }

}
