package com.demo.testUnit.domain.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private Integer edad;
}
