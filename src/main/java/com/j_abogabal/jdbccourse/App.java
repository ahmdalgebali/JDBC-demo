package com.j_abogabal.jdbccourse;

import java.util.Date;
import com.j_abogabal.jdbccourse.dao.EmployeeDao;
import com.j_abogabal.jdbccourse.dao.EmployeeDaoImpl;
import com.j_abogabal.jdbccourse.model.Employee;

public class App {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        Employee employee = Employee.builder()
                .name("Mos3ad")
                .gender(false)
                .birthDate(new Date())
                .salary(4992)
                .build();
        employeeDao.save(employee); 

        employeeDao.deleteById(41);
        System.out.println(employeeDao.findById(41));
        employeeDao.findAll().forEach(System.out::println);
        System.out.println("Done!");
    }
}