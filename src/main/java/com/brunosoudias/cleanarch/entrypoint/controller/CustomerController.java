package com.brunosoudias.cleanarch.entrypoint.controller;


import com.brunosoudias.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.brunosoudias.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.brunosoudias.cleanarch.core.usecase.InsertCustomeruseCase;
import com.brunosoudias.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.brunosoudias.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.brunosoudias.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.brunosoudias.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomeruseCase insertCustomeruseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomByIdUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer  = customerMapper.toCustomer(customerRequest);
        insertCustomeruseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id,@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id) {
        deleteCustomByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }


}
