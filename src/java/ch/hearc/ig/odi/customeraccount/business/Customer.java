package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

    private List<Account> accounts;
    private int number;
    private String firstName;
    private String lastName;

    
    /**
     *
     * @param number Client number
     * @param firstName Client first name
     * @param lastName Client last name
     */
    public Customer(Integer number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }
    
    /**
     *
     * @param number Account number to research
     * @return Get account by number
     */
    public Account getAccountByNumber(String number) {
        Account rs = null;
        for (Account account : getAccounts()) {
            if (account.getNumber().equals(number)) {
                rs = account;
            }
        }
        return rs;
    }

    /**
     *
     * @param number Account number to add
     * @param name Account name to add
     * @param rate Account rate to add
     */
    public void addAccount(String number, String name, double rate) {
        getAccounts().add(new Account(number, name, rate, this));
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
