package service;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import repo.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> list = new ArrayList<>();
        customerRepository.findAll().forEach(list::add);
        return list;
    }
}
