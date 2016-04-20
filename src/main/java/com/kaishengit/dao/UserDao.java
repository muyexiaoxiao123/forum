package com.kaishengit.dao;

import com.kaishengit.entity.User;
import com.kaishengit.util.DBHelp;
import org.apache.commons.dbutils.handlers.BeanHandler;
/**
 * Created by Administrator on 2016/4/8.
 */
public class UserDao {
    public User findByUsername(String username){
        String sql="SELECT * FROM t_user WHERE username=?";
        return DBHelp.query(sql,new BeanHandler<User>(User.class),username);
    }

    public User findByEmail(String email) {
        String sql= "SELECT * FROM t_user WHERE email=?";
        return DBHelp.query(sql,new BeanHandler<User>(User.class),email);
    }
    public void save(User user){
        String sql="INSERT INTO t_user(username,password,email,createtime,avatar,state) VALUES(?,?,?,?,?,?)";
        DBHelp.update(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getCreatetime(),user.getAvatar(),user.getState());
    }


}
