package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
JDBC的快速入门
 */
public class Jdbc_Demo01 {
    public static void main(String[] args) throws Exception {
        // 1.导入驱动JAR包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库的连接对象了
       Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");
       //4.定义sql语句
        String sql="update account set balance = 500 where ID = 1";
        //5.获取执行sql的对象 Statement
        Statement stmt=conn.createStatement();
        //6.执行sql
        int count =stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();

    }
}
