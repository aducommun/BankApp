package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */
@Named(value = "customerDetailsBean")
@SessionScoped
public class CustomerDetailsBean implements Serializable {
    
    @Inject Services services;
    private Customer customer;
    
    public String displayCustomer(Customer c) {
        if (c != null) {
            customer = c;
            return "display";
        } else {
            customer = null;
            return "error";
        }
    }
    
    public List<Account> getAccounts() {
        if (customer == null) {
            return new ArrayList();
        }
        return new ArrayList(customer.getAccounts().values());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
