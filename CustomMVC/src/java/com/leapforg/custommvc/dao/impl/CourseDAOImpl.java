/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.custommvc.dao.impl;

import com.leapforg.custommvc.dao.CourseDAO;
import com.leapforg.custommvc.dbutil.DBConnection;
import com.leapforg.custommvc.entity.Course;
import com.leapfrog.custommvc.constant.SQLConstant;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suren
 */
public class CourseDAOImpl implements CourseDAO{
    private DBConnection db=new DBConnection();
        
    @Override
    public List<Course> getAll() throws ClassNotFoundException, SQLException {
    List<Course> courseList= new ArrayList<>();
    db.open();
    db.initStatement(SQLConstant.COURSE_GET_ALL);
        ResultSet rs= db.exeucateQuery();
        while(rs.next()){
            Course c= new Course();
            c.setId(rs.getInt("course_id"));
            c.setName(rs.getString("course_name"));
            c.setDescription(rs.getString("course_description") );
            c.setFees(rs.getDouble("fees"));
            c.setStatus(rs.getBoolean("status"));
            courseList.add(c);
            
        }
        db.close();
    return courseList;
    }
 
    @Override
    public int insert(Course c) throws ClassNotFoundException, SQLException {
    
        db.open();
        PreparedStatement stmt=db.initStatement(SQLConstant.COURSE_INSERT);
        stmt.setString(1, c.getName());
        stmt.setString(2, c.getDescription());
        stmt.setDouble(3, c.getFees());
        stmt.setBoolean(4, c.getStatus());
        int result=db.exeucateUpdate();
        db.close();
        return result;
    }
    
}
