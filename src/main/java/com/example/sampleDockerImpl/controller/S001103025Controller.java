package com.example.sampleDockerImpl.controller;

import com.example.sampleDockerImpl.entities.S001103025;
import com.example.sampleDockerImpl.services.S001103025Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/integMaster")
class S001103025Controller {

    @Autowired
    S001103025Service s001103025Serv;

    @GetMapping("/findAll")
    public List<S001103025> findAll() {
        return s001103025Serv.getAll();
    }
    @PostMapping("/saveRecord")
    public void save(@RequestBody S001103025 s001103025) {
        s001103025Serv.save(s001103025);
    }
}
