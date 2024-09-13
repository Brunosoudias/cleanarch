package com.brunosoudias.cleanarch.dataprovider.repository.mapper;


import com.brunosoudias.cleanarch.core.domain.Customer;
import com.brunosoudias.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
