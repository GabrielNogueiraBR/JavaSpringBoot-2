package com.facens.poo.exercicio.employee.services;

import java.util.ArrayList;
import java.util.List;

import com.facens.poo.exercicio.employee.dto.EmployeeDTO;
import com.facens.poo.exercicio.employee.entities.EmployeeEntity;
import com.facens.poo.exercicio.employee.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository repository;

    public List<EmployeeDTO> getAllEmployees(){
        
        List<EmployeeEntity> employees = repository.getAllEmployees();
        
        List<EmployeeDTO> employeesDTO = new ArrayList<>();

        for (EmployeeEntity employee : employees) {
            employeesDTO.add(EmployeeDTO.toDTO(employee));
        }

        return employeesDTO;
    }

    public EmployeeEntity saveEmployee(EmployeeEntity employee){
        return repository.saveEmployee(employee);
    }
}
