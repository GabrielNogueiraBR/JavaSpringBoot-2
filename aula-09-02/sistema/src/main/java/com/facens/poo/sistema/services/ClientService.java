package com.facens.poo.sistema.services;

import java.util.ArrayList;
import java.util.List;

import com.facens.poo.sistema.dto.ClientDTO;
import com.facens.poo.sistema.entities.Client;
import com.facens.poo.sistema.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repository;

    public List<ClientDTO> getClients(){
        
        List<Client> list = repository.getClients();

        List<ClientDTO> listDTO = new ArrayList<>();

        for (Client client : list) {
            ClientDTO clientDTO = new ClientDTO();
            clientDTO.setId(client.getId());
            clientDTO.setName(client.getName());

            listDTO.add(clientDTO);
        }

        return listDTO;

    }
}
