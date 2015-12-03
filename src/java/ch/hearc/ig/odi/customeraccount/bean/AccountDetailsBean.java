package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author alexandr.ducommun
 */
@Named(value = "accountDetailsBean")
@SessionScoped
public class AccountDetailsBean implements Serializable {
    
    @Inject Services services;
    private Account account;
    
    public String displayAccount (Account a) {
        if (account != null) {
            this.account = a;
            return "display";
        } else {
            this.account = null;
            return "error";
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}
