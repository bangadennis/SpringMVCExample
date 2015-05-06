package com.springexample.controller;

import com.springexample.model.Employee;
import com.springexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by banga on 5/5/15.
 */
@Controller
public class SpringExample{
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/welcome")
    public String hello(Model model)
    {
        model.addAttribute("msg","HELLO WORLD");
        return "hello";
    }

    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "fname", required = false) String fname,
    @RequestParam(value = "lname", required = false) String lname,
    @RequestParam(value = "email", required = false) String email,
    @RequestParam(value = "phone", required = false) String phone
    ){
        ModelAndView model = new ModelAndView();

        if (phone.length() !=10){
            model.addObject("error","phone must 10 digits");
        }else {
            Employee employee = new Employee();
            employee.setFname(fname);
            employee.setLname(lname);
            employee.setEmail(email);
            employee.setPhone(phone);
            employeeService.insertRow(employee);
        }

        model.setViewName("hello");
        return model;
    }

    @RequestMapping("/list")
    public ModelAndView list()
    {
        List<Employee> employeeList =  employeeService.getList();

        ModelAndView model =new ModelAndView();

        model.addObject("employeeList", employeeList);

        model.setViewName("hello");

        return model;

    }
}
