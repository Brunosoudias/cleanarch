package com.brunosoudias.cleanarch.core.dataprovider;

import com.brunosoudias.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);

}
