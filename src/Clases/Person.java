/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;

/**
 * Representa la clase persona y contiene información de esta.
 * @author Yeisson Vahos Cortes
 */
public class Person {
    
    /**
     * Representa el numero de identificación de la persona.
     */
    private int personId;
    
    /**
     * Representa el nombre de la persona.
     */
    public String name;
    
    /**
     * Representa el primer apellido de la persona.
     */
    public String lastName1;
    
    /**
     * Representa el segundo apellido de la persona.
     */
    public String lastName2;
    
    /**
     * Representa la fecha de nacimiento de la persona.
     */
    public LocalDate dateBirth;
    
    /**
     * Representa el peso en kilogramos de la persona.
     */
    public float height;

    /**
     * Crea una instancia de la clase persona.
     * @param personId Representa el numero de identificación de la persona.
     * @param name Representa el nombre de la persona.
     * @param lastName1 Representa el primer apellido de la persona.
     * @param lastName2 Representa el segundo apellido de la persona.
     * @param dateBirth Representa la fecha de nacimiento de la persona.
     * @param height Representa el peso en kilogramos de la persona.
     */
    public Person(int personId, String name, String lastName1, String lastName2, LocalDate dateBirth, float height) {
        this.personId = personId;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Crea una instancia de la clase persona.
     * @param personId Representa el numero de identificación de la persona.
     * @param name Representa el nombre de la persona.
     * @param lastName1 Representa el primer apellido de la persona.
     * @param lastName2 Representa el segundo apellido de la persona.
     */
    public Person(int personId, String name, String lastName1, String lastName2) {
        this.personId = personId;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
    }
        
    /**
     * Representa el metodo para obtener el numero de identificación de la persona.
     * @return El valor correspondiente al numero de identificación de la persona.
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Representa el metodo para modificar el numero de identificación de la persona.
     * @param personId El valor que se quiere asignar al atributo correspondiente al numero de identificación de la persona.
     */
    public void setPersonId(int personId) {
        this.personId = personId;
    }

    /**
     * Representa el metodo para obtener el nombre de la persona.
     * @return El valor correspondiente al nombre de la persona.
     */
    public String getName() {
        return name;
    }

    /**
     * Representa el metodo para modificar el nombre de la persona.
     * @param name El valor que se quiere asignar al atributo correspondiente al nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Representa el metodo para obtener el primer apellido de la persona.
     * @return El valor correspondiente al primer apellido de la persona.
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Representa el metodo para modificar el primer apellido de la persona.
     * @param lastName1 El valor que se quiere asignar al atributo correspondiente al primer apellido de la persona.
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Representa el metodo para obtener el segundo apellido de la persona.
     * @return El valor correspondiente al segundo apellido de la persona.
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Representa el metodo para modificar el primer apellido de la persona.
     * @param lastName2 El valor que se quiere asignar al atributo correspondiente al primer apellido de la persona.
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Representa el metodo para obtener la fecha de nacimiento de la persona.
     * @return El valor correspondiente a la fecha de nacimiento de la persona.
     */
    public LocalDate getDateBirth() {
        return dateBirth;
    }

    /**
     * Representa el metodo para modificar la fecha de nacimiento de la persona.
     * @param dateBirth El valor que se quiere asignar al atributo correspondiente a la fecha de nacimiento de la persona.
     */
    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Representa el metodo para obtener el peso en kilogramos de la persona.
     * @return El valor correspondiente al peso en kilogramos de la persona.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Representa el metodo para modificar el peso en kilogramos de la persona.
     * @param height El valor que se quiere asignar al atributo correspondiente al peso en kilogramos de la persona.
     */
    public void setHeight(float height) {
        this.height = height;
    }
    
    
}
