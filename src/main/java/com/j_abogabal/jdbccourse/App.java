package com.j_abogabal.jdbccourse;

import java.util.Date;
import com.j_abogabal.jdbccourse.dao.EmployeeDao;
import com.j_abogabal.jdbccourse.dao.EmployeeDaoImpl;
import com.j_abogabal.jdbccourse.model.Employee;

public class App {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        Employee employee = Employee.builder()
                .name("Ahmed")
                .gender(false)
                .birthDate(new Date())
                .salary(4992)
                .build();
        //employeeDao.save(employee);
        
        //System.out.println(employeeDao.findById(2));
        employeeDao.deleteById(2);
        employeeDao.findAll().forEach(System.out::println);
        System.out.println("Done!");
    }
}