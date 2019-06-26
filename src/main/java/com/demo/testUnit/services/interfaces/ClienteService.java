package com.demo.testUnit.services.interfaces;

import com.demo.testUnit.domain.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> findAll();
}
