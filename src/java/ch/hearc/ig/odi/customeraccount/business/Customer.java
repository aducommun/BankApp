package ch.hearc.ig.odi.customeraccount.business;

import java.util.*;

public class Customer {

    private Map<String, Account> accounts;
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
        accounts = new HashMap();
    }

    /**
     * Return by id
     *
     * @param number Account number to research
     * @return Get account by number
     */
    public Account getAccountByNumber(String number) {
        return accounts.get(number);
    }

    /**
     *
     * @param number Account number to add
     * @param name Account name to add
     * @param rate Account rate to add
     * @return created account
     */
    public Account addAccount(String number, String name, double rate) {
        Account account = new Account(number, name, rate, this);
        this.accounts.put(number, account);
        return account;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public Map<String, Account> getAccounts() {
        return accounts;
    }

}
