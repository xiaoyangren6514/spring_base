package com.happy.hello.l.jdbc.dao;

import com.happy.hello.l.jdbc.domain.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by zhonglq on 2018/6/23.
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    @Override
    public void add(User user) {
        String sql = "insert into user values(null,?)";
        int update = super.getJdbcTemplate().update(sql, user.getName());
        System.out.println("add：" + update);
    }

    @Override
    public void delete(int uid) {
        String sql = "delete from user where id = ?";
        int update = super.getJdbcTemplate().update(sql, uid);
        System.out.println("delete：" + update);
    }

    @Override
    public void update(User user) {
        String sql = "update user set name = ? where id = ?";
        int update = super.getJdbcTemplate().update(sql, user.getName(), user.getId());
        System.out.println("update：" + update);
    }

    @Override
    public List<User> findAll() {
        String sql = "select * from user ";
        List<User> list = super.getJdbcTemplate().query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                return user;
            }
        });
        return list;
    }

    @Override
    public User findById(int id) {
        String sql = "select * from user where id = ?";
        return super.getJdbcTemplate().queryForObject(sql, (resultSet, i) -> {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            return user;
        }, id);
    }

}
