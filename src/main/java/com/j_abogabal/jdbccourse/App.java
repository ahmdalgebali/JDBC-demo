package com.j_abogabal.jdbccourse;

import java.sql.Connection;
import java.util.Date;
import com.j_abogabal.jdbccourse.dao.DBConnection;
import com.j_abogabal.jdbccourse.dao.EmployeeDao;
import com.j_abogabal.jdbccourse.dao.EmployeeDaoImpl;
import com.j_abogabal.jdbccourse.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        Employee employee = new Employee(1,"Mohamed",true,new Date(),2500d);
        employeeDao.save(employee);
        System.out.println("Done!");
    }
}