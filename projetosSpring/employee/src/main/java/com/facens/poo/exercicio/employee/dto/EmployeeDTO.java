package com.facens.poo.exercicio.employee.dto;

import com.facens.poo.exercicio.employee.entities.EmployeeEntity;

public class EmployeeDTO {
    private String name;
    private Double salary;
    private String mail;
    
    public EmployeeDTO(String name, Double salary, String mail) {
        this.name = name;
        this.salary = salary;
        this.mail = mail;
    }

    public EmployeeDTO() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public String getMail() {
        return mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    /**
     * This function will transform the objects of EmployeeEntity to EmployeeDTO
     * @param employee is the object instance what will be transformed into dto
     * @return the return of function is an object EmployeeDTO
     */
    static public EmployeeDTO toDTO(EmployeeEntity employee){
        
        EmployeeDTO employeeDTO = new EmployeeDTO();
        
        employeeDTO.setName(employee.getName());
        employeeDTO.setSalary(employee.getSalary());
        employeeDTO.setMail(employee.getMail());
    
        return employeeDTO;
    }

    /**
     * This function is responsible to get an object EmployeeDTO and transform it in an EmployeeEntity
     * @param employeeDTO
     * @return
     */
    static public EmployeeEntity fromDTO(EmployeeDTO employeeDTO){
        EmployeeEntity employee = new EmployeeEntity();

        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employee.setMail(employeeDTO.getMail());

        return employee;
    }
}