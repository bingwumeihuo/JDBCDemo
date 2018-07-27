package com.imooc.db;
import java.sql.*;

public class DBUtil{
    private static final String URL="jdbc:mysql://localhost:3306/imooc"+"?serverTimezone=GMT%2B8";
    private static final String USER="root";
    private static final String PASSWORD="1234";
    private static Connection conn;
    static {
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获得数据库的连接
             conn=DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt=conn.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }


}
