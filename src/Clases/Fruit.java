/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 * Representa la clase fruta y contiene información de esta.
 * @author Yeisson Vahos Cortes
 */
public class Fruit {
    
    /**
     * Representa el nombre de la fruta.
     */
    public String name;
    
    /**
     * Representa el peso promedio de una unidad de la fruta.
     */
    private float averageWeight;
    
    /**
     * Representa la lista de los posibles colores que puede presentar la fruta.
     */
    public ArrayList<String> colors;
    
    /**
     * Crea una instancia de la clase fruta.
     * @param name Representa el nombre de la fruta.
     * @param averageWeight Representa el peso promedio de una unidad de la fruta.
     * @param colors Representa la lista de los posibles colores que puede presentar la fruta.
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Crea una instancia de la clase fruta.
     * @param name Representa el nombre de la fruta.
     * @param averageWeight Representa el peso promedio de una unidad de la fruta.
     */
    public Fruit(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
    }

    /**
     * Representa el metodo para obtener el nombre de la fruta.
     * @return El valor del nombre de la fruta.
     */
    public String getName() {
        return name;
    }

    /**
     * Representa el metodo para modificar el nombre de la fruta.
     * @param name El valor que se quiere asignar al atributo correspondiente al nombre de la fruta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Representa el metodo para obtener el peso promedio de una unidad de la fruta.
     * @return El valor del peso promedio de una unidad de la fruta.
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Representa el metodo para modificar el peso promedio de una unidad de la fruta.
     * @param averageWeight El valor que se quiere asignar al atributo correspondiente al peso promedio de una unidad de la fruta.
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Representa el metodo para obtener la lista de los posibles colores que puede presentar la fruta.
     * @return La lista de los posibles colores que puede presentar la fruta.
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Representa el metodo para modificar la lista de los posibles colores que puede presentar la fruta.
     * @param colors La lista que se quiere asignar al atributo correspondiente al la lista de los posibles colores que puede presentar la fruta.
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

}
