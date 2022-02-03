/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 * Representa la clase compra, el proceso de compra de cierta cantidad de una fruta y su información.
 * @author Yeisson Vahos Cortes
 */
public class Buy {
    /**
     * Representa el numero de identificación de la compra.
     */
    public int buyId;
    
    /**
     * Representa la cantidad de fruta que se compra en el proceso.
     */
    public int numberOfFruit;
    
    /**
     * Representa las características de la fruta que se compra en el proceso.
     */
    public Features feature;
    
    /**
     * Representa la información de la cuenta de la persona que realiza la compra.
     */
    public BankAccount originAccount;
    
    /**
     * Representa la información de la cuenta de la persona que realiza la venta.
     */
    public BankAccount destinationAccount;
    
    /**
     * Crea una instancia de la clase compra.
     * @param buyId Representa el numero de identificación de la compra.
     * @param numberOfFruit Representa la cantidad de fruta que se compra en el proceso.
     * @param feature Representa las características de la fruta que se compra en el proceso.
     * @param originAccount Representa la información de la cuenta de la persona que realiza la compra.
     * @param destinationAccount Representa la información de la cuenta de la persona que realiza la venta.
     */

    public Buy(int buyId, int numberOfFruit, Features feature, BankAccount originAccount, BankAccount destinationAccount) {
        this.buyId = buyId;
        this.numberOfFruit = numberOfFruit;
        this.feature = feature;
        this.originAccount = originAccount;
        this.destinationAccount = destinationAccount;
    }
       
    /**
     * Representa el metodo para obtener el numero de identificación de la compra.
     * @return El valor correspondiente al numero de identificación de la compra.
     */
    public int getBuyId() {
        return buyId;
    }

    /**
     * Representa el metodo para modificar el numero de identificación de la compra.
     * @param buyId El valor que se quiere asignar al atributo correspondiente al numero de identificación de la compra.
     */
    public void setBuyId(int buyId) {
        this.buyId = buyId;
    }

    /**
     * Representa el metodo para obtener la cantidad de fruta que se compra en el proceso.
     * @return El valor correspondiente a la cantidad de fruta que se compra en el proceso.
     */
    public int getNumberOfFruit() {
        return numberOfFruit;
    }

    /**
     * Representa el metodo para modificar la cantidad de fruta que se compra en el proceso.
     * @param numberOfFruit El valor que se quiere asignar al atributo correspondiente a la cantidad de fruta que se compra en el proceso.
     */
    public void setNumberOfFruit(int numberOfFruit) {
        this.numberOfFruit = numberOfFruit;
    }

    /**
     * Representa el metodo para obtener las características de la fruta que se compra en el proceso.
     * @return El objeto correspondiente a las características de la fruta que se compra en el proceso.
     */
    public Features getFeature() {
        return feature;
    }

    /**
     * Representa el metodo para modificar las características de la fruta que se compra en el proceso.
     * @param feature El objeto que se quiere asignar al atributo correspondiente a las características de la fruta que se compra en el proceso.
     */
    public void setFeature(Features feature) {
        this.feature = feature;
    }

    /**
     * Representa el metodo para obtener la información de la cuenta de la persona que realiza la compra.
     * @return El objeto correspondiente a la información de la cuenta de la persona que realiza la compra.
     */
    public BankAccount getOriginAccount() {
        return originAccount;
    }

    /**
     * Representa el metodo para modificar la información de la cuenta de la persona que realiza la compra.
     * @param originAccount El objeto que se quiere asignar al atributo correspondiente a la información de la cuenta de la persona que realiza la compra.
     */
    public void setOriginAccountNumber(BankAccount originAccount) {
        this.originAccount = originAccount;
    }

    /**
     * Representa el metodo para obtener la información de la cuenta de la persona que realiza la venta.
     * @return El objeto correspondiente a la información de la cuenta de la persona que realiza la venta.
     */
    public BankAccount getDestinationAccount() {
        return destinationAccount;
    }

    /**
     * Representa el metodo para modificar la información de la cuenta de la persona que realiza la venta.
     * @param destinationAccount El objeto que se quiere asignar al atributo correspondiente a la información de la cuenta de la persona que realiza la venta.
     */
    public void setDestinationAccountNumber(BankAccount destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
       
}
