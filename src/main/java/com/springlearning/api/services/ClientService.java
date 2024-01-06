package com.springlearning.api.services;

import com.springlearning.api.domain.Client;
import com.springlearning.api.dto.ClientDTO;
import com.springlearning.api.repositories.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {
    private ClientRepository repository;
    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }

}
