package com.j_abogabal.jdbccourse.dao;

import java.util.List;

import com.j_abogabal.jdbccourse.model.Employee;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}
