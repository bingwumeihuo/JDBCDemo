package com.imooc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.imooc.db.DBUtil;
import com.imooc.model.Goddess;

public class GoddessDao {
    public void  addGoddess(Goddess g) throws SQLException {
        Connection conn=DBUtil.getConnection();
        String sql="" +
                "insert into imooc_goddess" +
                "(user_name,sex,age,birthday,email,mobile," +
                "create_user,create_date,update_user,update_date,isdel)" +
                "values(" +
                "?,?,?,?,?,?,?,current_date(),?,current_date(),?)";
        PreparedStatement ptmt=conn.prepareStatement(sql);
        ptmt.setString(1,g.getUser_name());
        ptmt.setInt(2, g.getSex(1));
        ptmt.setInt(3, g.getAge());
        ptmt.setDate(4, new Date(g.getBirthday(new java.util.Date()).getTime()));
        ptmt.setString(5, g.getEmail("1183233389@qq.com"));
        ptmt.setString(6, g.getMobile());
        ptmt.setString(7, g.getCreate_user());
        ptmt.setString(8, g.getUpdate_user());
        ptmt.setInt(9, g.getIsdel());
        ptmt.execute();
    }
    public  void delGoddess(){

    }
    public  void updateGoddess(){

    }
    public List<Goddess> query() throws SQLException {
        Connection conn=DBUtil.getConnection();
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select user_name ,age from imooc_goddess");
        List<Goddess> gs=new ArrayList<Goddess>();
        Goddess g=null;
        while (rs.next()){
            g=new Goddess();
            g.setUser_name(rs.getString("user_name"));
            g.setAge(rs.getInt("age"));
            gs.add(g);
            //System.out.println(rs.getString("user_name")+","+rs.getInt("age"));
        }
        return gs;
    }
    public  Goddess get(){
        return null;
    }

    }

