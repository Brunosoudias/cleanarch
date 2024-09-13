package com.brunosoudias.cleanarch.core.dataprovider;

import com.brunosoudias.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
