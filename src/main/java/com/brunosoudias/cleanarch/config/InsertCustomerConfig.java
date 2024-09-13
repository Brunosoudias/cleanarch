package com.brunosoudias.cleanarch.config;

import com.brunosoudias.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.brunosoudias.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.brunosoudias.cleanarch.dataprovider.InsertCustomerImpl;
import com.brunosoudias.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ){
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
