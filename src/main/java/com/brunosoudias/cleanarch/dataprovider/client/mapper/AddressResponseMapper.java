package com.brunosoudias.cleanarch.dataprovider.client.mapper;

import com.brunosoudias.cleanarch.core.domain.Address;
import com.brunosoudias.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}


