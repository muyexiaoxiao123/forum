package com.kaishengit.web.user;

import com.kaishengit.entity.User;
import com.kaishengit.service.UserService;
import com.kaishengit.web.BaseServlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/4/11.
 */
@WebServlet("/validate/emial.do")
public class validateEmialServlet extends BaseServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        UserService users=new UserService();
        User user=users.findByEmail(email);
        String result;
        if(user==null){
            result="true";

        }else{
            result="false";
        }
        rendText(resp,result);//返回一个jason
    }

}
