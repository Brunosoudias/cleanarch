package com.brunosoudias.cleanarch.core.usecase;

import com.brunosoudias.cleanarch.core.domain.Customer;

public interface InsertCustomeruseCase {

    void insert(Customer customer, String zipCode);
}
