package com.j_abogabal.jdbccourse;

import java.sql.Connection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.j_abogabal.jdbccourse.dao.DBConnection;
import com.j_abogabal.jdbccourse.dao.EmployeeDao;
import com.j_abogabal.jdbccourse.dao.EmployeeDaoImpl;
import com.j_abogabal.jdbccourse.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        List<Employee> employees = new LinkedList<>();
        EmployeeDao employeeDao = new EmployeeDaoImpl();
            // for(int i=0 ; i<3;i++){
            //     Employee employee = new Employee(i,"Mohamed",true,new Date(),2500d);
            //     employees.add(employee);
            //     for(Employee itr : employees){
            //         employeeDao.save(itr);
            //     }
            // }
            
            //System.out.println(employees.size());

        employeeDao.findAll().forEach(System.out::println);
        Employee emp = employeeDao.findById(36);
        System.out.println(emp);
        employeeDao.deleteById(36);
        System.out.println("Done!");


    }
}