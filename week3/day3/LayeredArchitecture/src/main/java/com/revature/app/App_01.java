package com.revature.app;

import com.revature.beans.Employee;
import com.revature.controller.SaverController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Red", "Oral", 15);
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        SaverController controller = ctxt.getBean(SaverController.class);
        controller.save(employee);
    }
}