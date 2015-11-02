package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;

/**
 *
 * @author alexandr.ducommun
 */
public class Bank {
    
    private int number;
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<Account> accounts;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    
    public Account getAccountByNumber(String number) {
        Account r = null;
        for (Account a : getAccounts()) {
            if (a.getNumber().equals(number)) {
                r = a;
            }
        }
        return r;
    }
    
    public Customer getCustomerByNumber(int number) {
        Customer r = null;
            for (Customer c : getCustomers()) {
                if (c.getNumber() == number) {
                    r = c;
                }
            }
        return r;
    }
    
    public void addCustomer(int number, String fn, String ln) {
        getCustomers().add(new Customer(number, fn, ln));
    }
    
    public void addAccount(String number, String name, double rate, Customer customer) {
        getAccounts().add(new Account(number, name, rate, customer));
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

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customer) {
        this.customers = customer;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
}
