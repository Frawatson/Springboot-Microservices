package com.watson.employeeservice.repository;

import com.watson.employeeservice.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> EmployeeList = new ArrayList<>();

    public Employee addEmployee(Employee employee){
        EmployeeList.add(employee);
        return employee;
    }

    public List<Employee> findByDepartment(Long departmentId){
        return EmployeeList.stream().filter(employee -> employee.departmentId().equals(departmentId)).toList();
    }

    public Employee findById(Long id){
        return EmployeeList.stream().filter(employee -> employee.id().equals(id)).findFirst().orElseThrow();
    }

    public List<Employee> findAll(){
        return EmployeeList;
    }
}
