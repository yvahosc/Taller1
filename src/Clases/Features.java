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
public class Features extends Fruit{
    public String origin;
    public int price;
    public String type;

    public Features(String origin, int price, String type, String name, float averageWeight) {
        super(name, averageWeight);
        this.origin = origin;
        this.price = price;
        this.type = type;
    }
    
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
