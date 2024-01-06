package com.springlearning.api.controllers;

import com.springlearning.api.dto.ClientDTO;
import com.springlearning.api.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
    @Autowired
    private ClientService service;
    @GetMapping(value = "/{id}")
    private ClientDTO findById(@PathVariable Long id){
    return service.findById(id);
    }

}
