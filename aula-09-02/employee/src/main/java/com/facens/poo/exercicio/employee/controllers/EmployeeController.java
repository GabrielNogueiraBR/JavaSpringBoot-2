package com.facens.poo.exercicio.employee.controllers;

import java.util.List;

import com.facens.poo.exercicio.employee.dto.EmployeeDTO;
import com.facens.poo.exercicio.employee.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService service;

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        List<EmployeeDTO> employeeDTOs = service.getAllEmployees();

        return ResponseEntity.ok(employeeDTOs);
    }
}
