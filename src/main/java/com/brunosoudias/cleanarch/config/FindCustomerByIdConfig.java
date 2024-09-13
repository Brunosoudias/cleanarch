package com.brunosoudias.cleanarch.config;

import com.brunosoudias.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.brunosoudias.cleanarch.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ){
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
