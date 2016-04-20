package com.kaishengit.service;

import com.kaishengit.dao.UserDao;
import com.kaishengit.entity.User;
import com.kaishengit.exception.ServiceException;
import org.joda.time.DateTime;

/**
 * Created by Administrator on 2016/4/11.
 */
public class UserService {
    private UserDao userDao=new UserDao();
    public void saveNewUser(String username,String password,String email){
        if(userDao.findByUsername(username)!=null){
            throw new ServiceException("注册失败，账号已被占用");
        }
        if(userDao.findByEmail(email)!=null){
            throw new ServiceException("注册失败，该邮箱已被验证！");
        }
        User user =new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setCreatetime(DateTime.now().toString());
        user.getAvatar();
        user.setState("USER_STATE_NORMAL ");
        userDao.save(user);

    }
    public User findByUsername(String username){
        return userDao.findByUsername(username);
    }
    public User findByEmail(String email){
        return userDao.findByEmail(email);
    }
}
