package com.j_abogabal.jdbccourse;

import java.sql.Connection;

import com.j_abogabal.jdbccourse.dao.DBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

       Connection con= DBConnection.getConnection();
       if(con==null){
        System.out.println("connection Failed");
       }else{
        System.out.println("connection Success");
       }

    }
}
