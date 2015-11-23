package ch.hearc.ig.odi.customeraccount.bean;

import java.io.Serializable;
import javax.ejb.Stateful;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */

@Named
@Stateful
public class CustomerBean implements Serializable {
    
    private String id;
    private String firstname;
    private String lastname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
