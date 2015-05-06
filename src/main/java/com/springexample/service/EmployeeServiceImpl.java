package com.springexample.service;

import com.springexample.dao.EmployeeDao;
import com.springexample.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by banga on 5/6/15.
 */
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    @Override
    public int insertRow(Employee employee) {

        return employeeDao.insertRow(employee);
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeDao.getEmployeeById(employeeId);
    }

    @Override
    public List<Employee> getList() {
        return employeeDao.getList();
    }

    @Override
    public int updateRow(Employee employee) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}
