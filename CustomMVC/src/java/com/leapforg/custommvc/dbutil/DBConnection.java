/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.custommvc.dbutil;

import com.leapfrog.custommvc.constant.DBConstant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author suren
 */
public class DBConnection {
    private Connection conn=null;
    private PreparedStatement stmt= null;
    
    public void open () throws ClassNotFoundException, SQLException{
        Class.forName(DBConstant.DB_DRIVER);
        conn=DriverManager.getConnection(DBConstant.DB_URL, DBConstant.DB_USER, DBConstant.DB_PASSWORD);
    }
    public PreparedStatement initStatement(String sql) throws SQLException{
     stmt=conn.prepareStatement(sql);
     return stmt;
    }
    
    public int exeucateUpdate() throws SQLException{
        return stmt.executeUpdate();
    }
    
    public ResultSet exeucateQuery() throws SQLException{
        return stmt.executeQuery();
    }
    public void close() throws SQLException{
        if(conn!= null && conn.isClosed()){
            conn.close();
            conn=null;
        }
        
    }
}
