package com.facens.poo.exercicio.employee.entities;

public class EmployeeEntity {
    private Long id;
    private String name;
    private Double salary;
    private String mail;

    public EmployeeEntity(Long id, String name, Double salary, String mail) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.mail = mail;
    }

    public EmployeeEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
