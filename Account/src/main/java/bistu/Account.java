package bistu;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        this(0, 0);
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() { return this.id; }
    public double getBalance() { return this.balance; }
    public double getAnnualInterestRate() { return this.annualInterestRate; }
    public double getMonthlyInterestRate() { return this.annualInterestRate / 12; }
    public Date getDateCreated() { return this.dateCreated; }
    public void setId(int id) { this.id = id; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setAnnualInterestRate(double ann) { this.annualInterestRate = ann; }
    
    public boolean withDraw(double money) {
        if (money > 0 && balance >= money) {
            balance -= money;
            return true;
        } else {
            return false;
        }
    }
    public boolean deposit(double money) {
        if (money > 0) {
            balance += money;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String str;
        str = "Balance             : " + this.getBalance() + '\n';
        str += "MonthlyInterestRate : " + this.getMonthlyInterestRate() + '\n';
        str += "CreatedDate         : " + this.getDateCreated();
        return str;
    }
}
