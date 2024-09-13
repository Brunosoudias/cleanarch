package com.brunosoudias.cleanarch.dataprovider.client;

import com.brunosoudias.cleanarch.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressbyZipCodeClient",
        url = "${dias.client.address.url}"
)
public interface FindAddressbyZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
