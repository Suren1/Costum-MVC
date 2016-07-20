/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.custommvc.dao;

import java.util.List;
import com.leapforg.custommvc.entity.Course;
import java.sql.SQLException;


/**
 *
 * @author suren
 */
public interface CourseDAO {
    
    List<Course> getAll()throws ClassNotFoundException,SQLException;
    int insert(Course c)throws ClassNotFoundException,SQLException;
}
