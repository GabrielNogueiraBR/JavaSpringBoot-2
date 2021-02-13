package com.facens.poo.exercicio.employee.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.facens.poo.exercicio.employee.entities.EmployeeEntity;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {
    
    // List of employees
    private List<EmployeeEntity> employees = new ArrayList<>();
    private Long nextID;

    /**
     * This function will create a new employees when the instace of Employeee Repository is called in Services
     */
    @PostConstruct
    public void createNewEmployees(){
        nextID = 1l;

        // First Employee
        EmployeeEntity employeeA = new EmployeeEntity();
        employeeA.setId(nextID++);
        employeeA.setName("Gabriel Augusto Nogueira");
        employeeA.setSalary(10.000);
        employeeA.setMail("gabriel@facens.br");

        // Second Employee
        EmployeeEntity employeeB = new EmployeeEntity(nextID++, "John Travolta", 25.000, "jtravolta@facens.br");

        // Insert employeeA and employeeB on the list of employees
        employees.add(employeeA);
        employees.add(employeeB);
    }

    public EmployeeEntity saveEmployee(EmployeeEntity employee){
        employee.setId(nextID++);

        // Add an new employee at list of employees
        employees.add(employee);

        return employee;
    }

    /**
     * This function get all employees of repository
     * @return List of employees
     */
    public List<EmployeeEntity> getAllEmployees(){
        return employees;
    }
}
