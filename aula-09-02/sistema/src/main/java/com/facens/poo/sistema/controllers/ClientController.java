package com.facens.poo.sistema.controllers;

import java.util.List;

import com.facens.poo.sistema.dto.ClientDTO;
import com.facens.poo.sistema.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientController {
    
    @Autowired
    private ClientService service;

    @GetMapping()
    public ResponseEntity<List<ClientDTO>> getClients(){
        List<ClientDTO> list = service.getClients();

        return ResponseEntity.ok(list);
    }

}
