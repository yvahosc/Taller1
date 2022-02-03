/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 * Representa la clase características que extiende de la clase fruta y contiene información de esta.
 * @author Yeisson Vahos Cortes
 */
public class Features extends Fruit{
    
    /**
     * Representa el lugar de origen de la fruta.
     */
    public String origin;
    
    /**
     * Representa el precio por kilogramo de la fruta.
     */
    public int price;
    
    /**
     * Representa la clasificación de la fruta.
     */
    public String type;
    
    /**
     * Crea una instancia de la clase características.
     * @param origin Representa el lugar de origen de la fruta.
     * @param price Representa el precio por kilogramo de la fruta.
     * @param type Representa la clasificación de la fruta.
     * @param name Representa el nombre de la fruta.
     * @param averageWeight Representa el peso promedio de una unidad de la fruta.
     */
    public Features(String origin, int price, String type, String name, float averageWeight) {
        super(name, averageWeight);
        this.origin = origin;
        this.price = price;
        this.type = type;
    }
    
    /**
     * Representa el metodo para obtener el lugar de origen de la fruta.
     * @return El valor correspondiente al lugar de origen de la fruta.
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Representa el metodo para modificar el lugar de origen de la fruta.
     * @param origin El valor que se quiere asignar al atributo correspondiente al lugar de origen de la fruta.
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Representa el metodo para obtener el precio por kilogramo de la fruta.
     * @return El valor correspondiente al precio por kilogramo de la fruta.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Representa el metodo para modificar el precio por kilogramo de la fruta.
     * @param price El valor que se quiere asignar al atributo correspondiente al precio por kilogramo de la fruta.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Representa el metodo para obtener la clasificación de la fruta.
     * @return El valor correspondiente a la clasificación de la fruta.
     */
    public String getType() {
        return type;
    }

    /**
     * Representa el metodo para modificar la clasificación de la fruta.
     * @param type El valor que se quiere asignar al atributo correspondiente a la clasificación de la fruta.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
