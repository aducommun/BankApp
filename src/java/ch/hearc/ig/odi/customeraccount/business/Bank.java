package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alexandr.ducommun
 */
public class Bank {
    
    private int number;
    private String name;
    private HashMap<Integer, Customer> customers;
    private ArrayList<Account> accounts;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new HashMap<>();
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
            for (Customer c : getCustomers().values()) {
                if (c.getNumber() == number) {
                    r = c;
                }
            }
        return r;
    }
    
    public Customer addCustomer(int number, String fn, String ln) {
        getCustomers().put(number, new Customer(number, fn, ln));
        return customers.get(number);
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

    public HashMap<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<Integer, Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
}
