package com.demo.testUnit.services;

import com.demo.testUnit.domain.model.Cliente;
import com.demo.testUnit.domain.repository.ClienteRepository;
import com.demo.testUnit.services.impl.ClienteServiceImpl;
import com.demo.testUnit.services.interfaces.ClienteService;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class ClienteServiceImplTest {

    @Mock
    private ClienteRepository clienteRepository;

    @Mock
    private ClienteService clienteService;

    @Before
    public void setUp() {
        clienteService = new ClienteServiceImpl(clienteRepository);
    }


    @Test
    public void testFindAll() {
        List<Cliente> clienteList = new ArrayList<>();
        Cliente cliente = new Cliente();
        clienteList.add(cliente);

         Mockito.when(clienteRepository.findAll())
               .thenReturn(clienteList);

        Assertions.assertThat(clienteService.findAll()).isEqualTo(clienteList);

    }

}
