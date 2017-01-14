package service;

import model.Customer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jihun on 2017. 1. 14..
 */
public class CustomerService {
    private Map<String, Customer> customers;

    private static final CustomerService instance = new CustomerService();

    private CustomerService() {
        this.customers = new HashMap<String, Customer>();
    }

    public static CustomerService getInstance() {
        return instance;
    }

    public void registerCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    private Customer findCustomer(String id) {
        Customer customer = null;

        if(customers.containsKey(id))
            customer = customers.get(id);

        return customer;
    }

    public Customer login(String id, String password) {
        Customer customer = findCustomer(id);

        if(customer!=null) {
            if(customer.getPassword().equals(password))
                return customer;
        }
        return null;
    }
}
