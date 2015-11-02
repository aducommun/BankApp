package ch.hearc.ig.odi.customeraccount.application;

import ch.hearc.ig.odi.customeraccount.business.*;
import static ch.hearc.ig.odi.customeraccount.business.Account.transfer;

/**
 *
 * @author alexandr.ducommun
 */
public class App {
    
    public static void main(String[] args) {
        new App().run();
    }
    
    private void run() {
        System.out.println("HELLO WORLD");
        
        //Les clients
        Customer clientADU = new Customer(1, "Alexandre", "Ducommun");
        Customer clientAKU = new Customer(2, "Ajtene", "Kurtaliqi");
        
        //Les comptes
        clientADU.addAccount("CS-10", "Salaire", 5.5);
        clientAKU.addAccount("CE-20", "Epargne", 10);
        
        //Approvisionnement des comptes
        clientADU.getAccountByNumber("CS-10").credit(10000);
        clientAKU.getAccountByNumber("CE-20").debit(10000);
        
        //Test transfert
        transfer(10000, clientADU.getAccountByNumber("CS-10"), clientAKU.getAccountByNumber("CE-20"));
        
        //Print
        System.out.println(clientADU.getFirstName() + " " + clientADU.getAccountByNumber("CS-10").getBalance());
    }
    
}
