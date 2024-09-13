package com.brunosoudias.cleanarch.dataprovider.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private AddressEntity addressEntity;

    private String cpf;

    private Boolean isValidCpf;

}