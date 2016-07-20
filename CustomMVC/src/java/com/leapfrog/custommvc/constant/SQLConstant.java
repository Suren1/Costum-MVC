/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.constant;

/**
 *
 * @author suren
 */
public class SQLConstant {
   public static final String COURSE_INSERT="INSERT INTO " + TableConstant.TABLE_COURSE + "(course_name,course_description,fees,status) VALUES(?,?,?,?)";
   
   public static final String COURSE_GET_ALL="SELECT * FROM" + TableConstant.TABLE_COURSE;
   
}
