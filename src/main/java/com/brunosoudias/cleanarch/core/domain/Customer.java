package com.brunosoudias.cleanarch.core.domain;

public class Customer {

    public Customer(){
        this.isValidCpd = false;
    }

    public Customer(String id, String name, String cpf, Address address, Boolean isValidCpd) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.isValidCpd = isValidCpd;
    }

    private String id;

    private String name;

    private String cpf;

    private Address address;

    private Boolean isValidCpd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getValidCpd() {
        return isValidCpd;
    }

    public void setValidCpd(Boolean validCpd) {
        isValidCpd = validCpd;
    }
}
