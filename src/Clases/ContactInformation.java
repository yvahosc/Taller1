/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 * Representa la clase información de contacto que extiende de la clase persona y continene su información de contacto.
 * @author Yeisson Vahos Cortes
 */
public class ContactInformation extends Person{
    
    /**
     * Representa la dirección de residencia de la persona.
     */
    private String address;
    
    /**
     * Representa la dirección de correo electrónico de la persona.
     */
    private String email;    

    /**
     * Crea una instancia de la clase información de contacto.
     * @param address Representa la dirección de residencia de la persona.
     * @param email Representa la dirección de correo electrónico de la persona.
     * @param personId Representa el numero de identificación de la persona.
     * @param name Representa el nombre de la persona.
     * @param lastName1 Representa el primer apellido de la persona.
     * @param lastName2 Representa el segundo apellido de la persona.
     */
    public ContactInformation(String address, String email, int personId, String name, String lastName1, String lastName2) {
        super(personId, name, lastName1, lastName2);
        this.address = address;
        this.email = email;
    }
    
    /**
     * Representa el metodo para obtener la dirección de residencia de la persona.
     * @return El valor correspondiente a la dirección de residencia de la persona.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Representa el metodo para modificar la dirección de residencia de la persona.
     * @param address El valor que se quiere asignar al atributo correspondiente a la dirección de residencia de la persona.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Representa el metodo para obtener la dirección de correo electrónico de la persona.
     * @return El valor correspondiente a la dirección de correo electrónico de la persona.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Representa el metodo para modificar la dirección de correo electrónico de la persona.
     * @param email El valor que se quiere asignar al atributo correspondiente a la dirección de correo electrónico de la persona.
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
