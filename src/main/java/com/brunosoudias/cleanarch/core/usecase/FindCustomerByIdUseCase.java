package com.brunosoudias.cleanarch.core.usecase;

import com.brunosoudias.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
