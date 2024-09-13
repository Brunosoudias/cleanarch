package com.brunosoudias.cleanarch.core.usecase.impl;

import com.brunosoudias.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.brunosoudias.cleanarch.core.dataprovider.InsertCustomer;
import com.brunosoudias.cleanarch.core.dataprovider.SendCpfForValidation;
import com.brunosoudias.cleanarch.core.domain.Customer;
import com.brunosoudias.cleanarch.core.usecase.InsertCustomeruseCase;


public class InsertCustomerUseCaseImpl implements InsertCustomeruseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustomerUseCaseImpl(
        FindAddressByZipCode findAddressByZipCode,
        InsertCustomer insertCustomer,
        SendCpfForValidation sendCpfForValidation
    ){
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
        sendCpfForValidation.send(customer.getCpf());
    }

}
