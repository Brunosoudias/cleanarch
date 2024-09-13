package com.brunosoudias.cleanarch.core.usecase.impl;

import com.brunosoudias.cleanarch.core.dataprovider.DeleteCustomerById;
import com.brunosoudias.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.brunosoudias.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    private final FindCustomerByIdUseCase findCustomerIdUseCase;

    private final DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerById deleteCustomerById
    ){
        this.findCustomerIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        findCustomerIdUseCase.find(id);
        deleteCustomerById.delete(id);
    }
}
