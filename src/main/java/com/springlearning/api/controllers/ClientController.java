package com.springlearning.api.controllers;

import com.springlearning.api.dto.ClientDTO;
import com.springlearning.api.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService service;
    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
    return service.findById(id);
    }
    @GetMapping
    public Page<ClientDTO> findByAll(Pageable pageable){
        return service.findAll(pageable);
    }

}
