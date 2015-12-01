package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */

@Named (value="customer")
@SessionScoped
public class CustomerCreateBean implements Serializable{

    private int number;
    private String firstName;
    private String lastName;

    @Inject
    Services services;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addCustomer() {
        services.saveCustomer(number, firstName, lastName);
    }

}
