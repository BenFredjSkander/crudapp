package com.skander.crudapp.service;

import com.skander.crudapp.model.Customer;
import com.skander.crudapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {
    @Autowired
    CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getCustomerinfos(){
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerByID(long ID){
        return customerRepository.findById(ID);
    }

    public Boolean checkExistedCustomer(long ID){
        if (customerRepository.existsById(ID)) {
            return true;
        }else{
            return false;
        }
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(long id) {
        customerRepository.deleteById(id);
    }
}
