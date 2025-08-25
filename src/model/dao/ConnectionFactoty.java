package model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionFactoty {
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String banco = "jdbc:mysql://localhost:3306/hotel";
    public static final String usuario = "root";
    public static final String senha = "ifsc";
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(banco + "?verifyServerCertificate=false"
                    + "&useSSL=false"
                    + "&requireSSL=false"
                    + "&USER=" + usuario + "&password=" + senha + "&serverTimezone=UTC");
        } catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public static  void closeConnecition(Connection conexao){
        try {
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static  void closeConnecition(Connection conexao, PreparedStatement psmt){
        try {
            psmt.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static  void closeConnecition(Connection conexao, PreparedStatement psmt, ResultSet rst){
        try {
            psmt.close();
            rst.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
