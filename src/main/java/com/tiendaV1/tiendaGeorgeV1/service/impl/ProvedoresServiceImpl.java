package com.tiendaV1.tiendaGeorgeV1.service.impl;

import com.tiendaV1.tiendaGeorgeV1.entity.Provedor;
import com.tiendaV1.tiendaGeorgeV1.repository.ProvedorRepository;
import com.tiendaV1.tiendaGeorgeV1.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvedoresServiceImpl implements ProvedorService {
    @Autowired
    private ProvedorRepository provedorRepository;

    @Override
    public List<Provedor> Provedores() {
        return provedorRepository.findAll();
    }
}
