/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 * Representa la clase cuenta bancaria que extiende de la clase persona y su información.
 * @author Yeisson Vahos Cortes
 */
public class BankAccount extends Person{
    /**
     * Representa el numero de identificación de la cuenta bancaria.
     */
    private int accountNumber;
    /**
     * Representa el estado de la cuenta bancaria.
     */
    protected boolean activated;
    /**
     * Representa el saldo de la cuenta bancaria.
     */
    private int balance;

    /**
     * Crea una instancia de la clase cuenta bancaria.
     * @param accountNumber Representa el numero de identificación de la cuenta bancaria.
     * @param activated Representa el estado de la cuenta bancaria.
     * @param balance Representa el saldo de la cuenta bancaria.
     * @param personId Representa el numero de identificación de la persona dueña de la cuenta bancaria.
     * @param name Representa el nombre de la persona dueña de la cuenta bancaria.
     * @param lastName1 Representa el primer apellido de la persona dueña de la cuenta bancaria.
     * @param lastName2 Representa el segundo apellido de la persona dueña de la cuenta bancaria.
     */
    public BankAccount(int accountNumber, boolean activated, int balance, int personId, String name, String lastName1, String lastName2) {
        super(personId, name, lastName1, lastName2);
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.balance = balance;
    } 

    /**
     * Representa el metodo para obtener el numero de identificación de la cuenta bancaria.
     * @return El valor correspondiente al numero de identificación de la cuenta bancaria.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Representa el metodo para modificar el numero de identificación de la cuenta bancaria.
     * @param accountNumber El valor que se quiere asignar al atributo correspondiente al numero de identificación de la cuenta bancaria.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Representa el metodo para para obtener el estado de la cuenta bancaria.
     * @return El valor booleano del estado de la cuenta bancaria.
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Representa el metodo para modificar el estado de la cuenta bancaria.
     * @param activated El valor que se quiere asignar al atributo correspondiente al estado de la cuenta bancaria. 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Representa el metodo para para obtener el saldo de la cuenta bancaria.
     * @return El valor correspondiente al saldo de la cuenta bancaria.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Representa el metodo para modificar el saldo de la cuenta bancaria.
     * @param balance El valor que se quiere asignar al atributo correspondiente al saldo de la cuenta bancaria. 
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
