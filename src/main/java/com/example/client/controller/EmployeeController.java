package com.example.client.controller;

import com.example.client.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @GetMapping
  public Employee getEmployee(){
    return new Employee("1","Tribhuwan","tr@gmail.com");

  }

}
