package com.facens.poo.sistema.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.facens.poo.sistema.dto.ClientDTO;
import com.facens.poo.sistema.dto.ClientInsertDTO;
import com.facens.poo.sistema.entities.Client;
import com.facens.poo.sistema.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<ClientDTO> getClients() {

        List<Client> list = repository.findAll();

        return toDTOList(list);
    }

    public ClientDTO getClientById(Long id) {

        Optional<Client> op = repository.findById(id);

        Client client = op.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found"));

        return new ClientDTO(client);
    }

    public List<ClientDTO> toDTOList(List<Client> list) {

        List<ClientDTO> listDTO = new ArrayList<>();
        for (Client client : list) {
            ClientDTO clientDTO = new ClientDTO();
            clientDTO.setId(client.getId());
            clientDTO.setName(client.getName());

            listDTO.add(clientDTO);
        }

        return listDTO;
    }

    public ClientDTO insert(ClientInsertDTO dto){
        Client entity = new Client(dto);

        entity = repository.save(entity);

        return new ClientDTO(entity);
    }
}
