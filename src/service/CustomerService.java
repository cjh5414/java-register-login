package service;

import model.Customer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jihun on 2017. 1. 14..
 */
public class CustomerService {
    private Map<String, Customer> customers;

    public CustomerService() {
        this.customers = new HashMap<String, Customer>();
    }

    public void registerCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }
}
