package com.brunosoudias.cleanarch.core.usecase;

import com.brunosoudias.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
