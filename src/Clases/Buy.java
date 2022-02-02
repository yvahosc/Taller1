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
