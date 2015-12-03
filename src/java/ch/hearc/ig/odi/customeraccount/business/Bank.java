package ch.hearc.ig.odi.customeraccount.business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alexandr.ducommun
 */
public class Bank {

    private int number;
    private String name;
    private Map<Integer, Customer> customers;
    private Map<String, Account> accounts;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new HashMap();
        this.accounts = new HashMap();
    }

    public Account getAccountByNumber(String number) {
        return this.accounts.get(number);
    }

    public Customer getCustomerByNumber(int number) {
        return this.customers.get(number);
    }

    public Customer addCustomer(int number, String fn, String ln) {
        Customer customer = null;

        if (!customers.containsKey(number)) {
            customer = new Customer(number, fn, ln);
            customers.put(number, customer);
        } else {
            throw new IllegalStateException("A customer with that number already exists");
        }

        return customer;
    }

    public Account addAccount(String number, String name, double rate, Customer customer) {

        Account account = null;

        if (!customers.containsValue(customer)) {
            throw new IllegalStateException("Customer doesn't belongs to that bank.");
        }

        if (!accounts.containsKey(number)) {
            account = customer.addAccount(number, name, rate);
        } else {
            throw new IllegalStateException("An account with tha number already exists.");
        }
        
        return account;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

}
