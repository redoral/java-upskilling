package com.revature.controller;

import com.revature.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @RequestMapping(value = "/empreg", method = RequestMethod.GET)
    public ModelAndView newEmployee(){
        ModelAndView modelAndView = new ModelAndView("EmployeeRegistration");
        return modelAndView;
    }

    @RequestMapping(value = "/empreg", method = RequestMethod.POST)
    public ModelAndView showEmployee(@RequestParam("id") int id,
                                     @RequestParam("name") String name,
                                     @RequestParam("deptno") int deptno){
        ModelAndView modelAndView = new ModelAndView("ShowEmp");
//        String employee = "ID : "+id+", Name : "+name+", DeptNO : "+deptno;
        Employee employee = new Employee(id, name, deptno);
        modelAndView.addObject("emp",employee);
        return modelAndView;
    }


}
