package ch.hearc.ig.odi.customeraccount.business;

public class Account {

    private String number;
    private String name;
    private double balance = 0;
    private double rate = 0.001;
    private Customer customer;

    /**
     *
     * @param number Account number
     * @param name Account name
     * @param rate Account rate
     * @param customer Account owner
     */
    public Account(String number, String name, double rate, Customer customer) {
        this.number = number;
        this.name = name;
        this.rate = rate;
        this.customer = customer;
    }

    /**
     *
     * @param amount Credit amount
     */
    public void credit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalStateException("Error, amount doit être plus grand que 0.");
        }
    }

    /**
     *
     * @param amount Debit amount
     */
    public void debit(double amount) {
        if (this.balance - amount < 0) {
            throw new IllegalStateException("Solde insuffisant pour la transaction");
        } else if (amount < 0) {
            throw new IllegalStateException("Error, amount doit être plus grand que 0.");
        }else {
            this.balance -= amount;
        }
    }

    /**
     *
     * @param amount Amount for transfer
     * @param source Source account for transfer
     * @param target Target account for transfer
     */
    public static void transfer(double amount, Account source, Account target) {
        if (amount <= 0) {
            throw new IllegalStateException("amount doit être plus grand que 0.");
        }
        source.debit(amount);
        target.credit(amount);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
