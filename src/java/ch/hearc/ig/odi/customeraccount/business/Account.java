package ch.hearc.ig.odi.customeraccount.business;

public class Account {

	private Customer customer;
	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.001;

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
		setBalance(getBalance() + amount);
	}

	/**
	 * 
	 * @param amount Debit amount
	 */
	public void debit(double amount) {
		setBalance(getBalance() - amount);
	}

	/**
	 * 
	 * @param amount Amount for transfer
	 * @param source Source account for transfer
	 * @param target Target account for transfer
	 */
	public static void transfer(double amount, Account source, Account target) {
		if ((source.getBalance() - amount) < 0) {
                    throw new IllegalStateException("Solde insuffisant");
                }
                source.debit(amount);
                target.credit(amount);
	}

}