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
public class Buy extends BankAccount{
    public int buyId;
    public int totalToPay;

    public Buy(int buyId, int totalToPay, int accountNumber, boolean activated, int personId, String name, String lastName1, String lastName2) {
        super(accountNumber, activated, personId, name, lastName1, lastName2);
        this.buyId = buyId;
        this.totalToPay = totalToPay;
    }

    public int getBuyId() {
        return buyId;
    }

    public void setBuyId(int buyId) {
        this.buyId = buyId;
    }

    public int getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(int totalToPay) {
        this.totalToPay = totalToPay;
    }
    
    
    
}
