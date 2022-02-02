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
public class ContactInformation extends Person{
    
    private String address;
    private String email;    

    public ContactInformation(String address, String email, int personId, String name, String lastName1, String lastName2) {
        super(personId, name, lastName1, lastName2);
        this.address = address;
        this.email = email;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
