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
public class Buy {
    public int buyId;
    public int numberOfFruit;
    public Features feature;
    public BankAccount originAccountNumber;
    public BankAccount destinationAccountNumber;

    public Buy(int buyId, int numberOfFruit, Features feature, BankAccount originAccountNumber, BankAccount destinationAccountNumber) {
        this.buyId = buyId;
        this.numberOfFruit = numberOfFruit;
        this.feature = feature;
        this.originAccountNumber = originAccountNumber;
        this.destinationAccountNumber = destinationAccountNumber;
    }
       
    public int getBuyId() {
        return buyId;
    }

    public void setBuyId(int buyId) {
        this.buyId = buyId;
    }

    public int getNumberOfFruit() {
        return numberOfFruit;
    }

    public void setNumberOfFruit(int numberOfFruit) {
        this.numberOfFruit = numberOfFruit;
    }

    public Features getFeature() {
        return feature;
    }

    public void setFeature(Features feature) {
        this.feature = feature;
    }

    public BankAccount getOriginAccountNumber() {
        return originAccountNumber;
    }

    public void setOriginAccountNumber(BankAccount originAccountNumber) {
        this.originAccountNumber = originAccountNumber;
    }

    public BankAccount getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    public void setDestinationAccountNumber(BankAccount destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }
       
}
