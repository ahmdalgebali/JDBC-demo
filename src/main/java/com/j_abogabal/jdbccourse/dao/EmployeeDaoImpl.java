package com.j_abogabal.jdbccourse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.j_abogabal.jdbccourse.model.Employee;
import com.j_abogabal.jdbccourse.utils.Utils;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public List<Employee> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Employee findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Employee employee) {
        Connection con = DBConnection.getConnection();
        if(con == null) {
            return;
        }

        if(employee.getId() > 0) { // Update
            String query = "UPDATE employee SET name=?, gender=?, birth_date=?, salary=? WHERE id=?;";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, employee.getName());
                preparedStatement.setBoolean(2, employee.isGender());
                preparedStatement.setDate(3, Utils.getSqlDate(employee.getBirthDate()));
                preparedStatement.setDouble(4, employee.getSalary());
                preparedStatement.setInt(5, employee.getId());
                preparedStatement.executeUpdate();
            } catch(SQLException se) {
                se.printStackTrace();
            } finally {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        } else { // Create
            String query = "INSERT INTO employee (name, gender, birth_date, salary) VALUES (?, ?, ?, ?);";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setString(1, employee.getName());
                preparedStatement.setBoolean(2, employee.isGender());
                preparedStatement.setDate(3, Utils.getSqlDate(employee.getBirthDate()));
                preparedStatement.setDouble(4, employee.getSalary());
                preparedStatement.executeUpdate();
            } catch(SQLException se) {
                se.printStackTrace();
            } finally {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteById(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
