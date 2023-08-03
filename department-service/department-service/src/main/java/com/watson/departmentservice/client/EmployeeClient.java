package com.watson.departmentservice.client;

import com.watson.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("employee/department/{departmemtId}")
    public List<Employee> findByDepartment(@PathVariable("departmemtId") Long departmemtId);
}
