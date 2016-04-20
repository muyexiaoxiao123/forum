package com.kaishengit.util;

import com.kaishengit.exception.DataAccessException;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.SQLException;

/**
 * Created by Administrator on 2016/4/8.
 */
public class DBHelp {
    public static <T> T query(String sql, ResultSetHandler<T> handler,Object...params){
        QueryRunner qr=new QueryRunner(ConnectionManager.getDataSource());
        try{
            return qr.query(sql,handler,params);
        }catch(SQLException e){
            e.printStackTrace();
            throw new DataAccessException(e,"SQL:"+sql);
        }
    }
    public static void update(String sql,Object...params){
        QueryRunner qr=new QueryRunner(ConnectionManager.getDataSource());
        try {
            qr.update(sql,params);
        } catch (SQLException e) {
           e.printStackTrace();
            throw new DataAccessException(e,"SQL:"+sql);
        }


    }

}
