package com.example.datasourceapp.controller;

import com.example.datasourceapp.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Mycontroller {

    @GetMapping(value = "/")
    public ResponseEntity<Address> method(){
        Address address = new Address();

        address.setCity("Mangalagiri");
        address.setCountry("India");
        return ResponseEntity.ok(address);
    }

}
