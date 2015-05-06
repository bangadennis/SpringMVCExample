package com.springexample.service;

import com.springexample.model.Employee;

import java.util.List;

/**
 * Created by banga on 5/6/15.
 */
public interface EmployeeService {

    public int insertRow(Employee employee);

    public Employee getEmployeeById(int employeeId);

    public List<Employee> getList();

    public int updateRow(Employee employee);

    public int deleteRow(int id);

}
