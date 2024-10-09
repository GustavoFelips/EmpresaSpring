package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.example.demo.model.Empresa;
import com.example.demo.repository.EmpresaRepository;

@Service
public class EmpresaService implements IEmpresaService {
    private EmpresaRepository empresaRepository;

    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> findById(UUID id) {
        return empresaRepository.findById(id);
    }

    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void delete(UUID id) {
        empresaRepository.deleteById(id);
    }
}
