package com.brunosoudias.cleanarch.dataprovider;

import com.brunosoudias.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.brunosoudias.cleanarch.core.domain.Address;
import com.brunosoudias.cleanarch.dataprovider.client.FindAddressbyZipCodeClient;
import com.brunosoudias.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressbyZipCodeClient findAddressbyZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressbyZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
