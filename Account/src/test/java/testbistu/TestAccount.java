package testbistu;

import bistu.*;

public class TestAccount {
    public static void main(String[] args) {
        Account ac = new Account(1122, 20000);
        ac.setAnnualInterestRate(0.045);
        ac.withDraw(2500);
        ac.deposit(3000);

        System.out.println(ac);
        System.out.println("Interest            : " + ac.getMonthlyInterestRate() * ac.getBalance());
    }
}