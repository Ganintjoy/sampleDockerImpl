package com.example.sampleDockerImpl.services;

import com.example.sampleDockerImpl.entities.S001103025;
import com.example.sampleDockerImpl.repo.S001103025Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class S001103025Service {

    @Autowired
    S001103025Repo repo;

    public List<S001103025> getAll() {
        return repo.findAll();
    }
    public void save(S001103025 s001103025) {
        repo.save(s001103025);
    }

}
