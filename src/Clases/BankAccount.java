/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Yeisson Vahos Cortes
 */
public class BankAccount extends Person{
    private int accountNumber;
    protected boolean activated;
    private int balance;

    public BankAccount(int accountNumber, boolean activated, int balance, int personId, String name, String lastName1, String lastName2) {
        super(personId, name, lastName1, lastName2);
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
