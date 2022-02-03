/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Clases.BankAccount;
import Clases.Buy;
import Clases.ContactInformation;
import Clases.Features;
import Clases.Fruit;
import Clases.Person;
import java.time.*;
import java.util.ArrayList;

/**
 * Representa la clase principal del código, instancia y prueba la creación de las clases.
 * @author Yeisson Vahos Cortes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Representa la creación de una instancia de la clase persona.
         */
        Person person1 = new Person(111111111, "Yeisson", "Vahos", "Cortes", LocalDate.of(1996, Month.JULY, 24), 60);
        
        /**
         * Representa la impresión en consola de la información de la instancia de la clase persona creada.
         */
        System.out.println("Person 1 - Buyer" + "\n" + "personId: " + person1.getPersonId() + "\n" + "name: " + person1.name + "\n" + "lastName 1: " + person1.lastName1 + "\n" + "lastName 2: " + person1.lastName2 + "\n" + "Date birth: " + person1.dateBirth + "\n" + "Peso (Kg): " + person1.height + "\n");
        
        /**
         * Representa la creación de una instancia de la clase persona.
         */
        Person person2 = new Person(2222222, "Juana", "De", "Arco", LocalDate.of(1896, Month.JULY, 24), 160);
        
        /**
         * Representa la impresión en consola de la información de la instancia de la clase persona creada.
         */
        System.out.println("Person 2 - Seller" + "\n" + "personId: " + person2.getPersonId() + "\n" + "name: " + person2.name + "\n" + "lastName 1: " + person2.lastName1 + "\n" + "lastName 2: " + person2.lastName2 + "\n" + "Date birth: " + person2.dateBirth + "\n" + "Peso (Kg): " + person2.height + "\n");
        
        /**
         * Representa la creación de una instancia de la clase cuenta bancaria asociada a la primera instancia de la clase persona creada.
         */
        BankAccount bankAccount1 = new BankAccount(123456789, true, 100000, person1.getPersonId(), person1.name, person1.lastName1, person1.lastName2);
        
        /**
         * Representa la impresión en consola de la información de la instancia de la clase cuenta bancaria creada.
         */
        System.out.println("Account 1" + "\n" + "Account number: " + bankAccount1.getAccountNumber() + "\n" + "Activated account: " + bankAccount1.isActivated() + "\n" + "personId: " + bankAccount1.getPersonId() + "\n" + "name: " + bankAccount1.name + "\n" + "lastName 1: " + bankAccount1.lastName1 + "\n" + "lastName 2: " + bankAccount1.lastName2 + "\n" + "Balance: " + bankAccount1.getBalance() + "\n");
        
        /**
         * Representa la creación de una instancia de la clase cuenta bancaria asociada a la segunda instancia de la clase persona creada.
         */
        BankAccount bankAccount2 = new BankAccount(987456321, true, 0, person2.getPersonId(), person2.name, person2.lastName1, person2.lastName2);
        
        /**
         * Representa la impresión en consola de la información de la otra instancia de la clase cuenta bancaria creada.
         */
        System.out.println("Account 2" + "\n" + "Account number: " + bankAccount2.getAccountNumber() + "\n" + "Activated account: " + bankAccount2.isActivated() + "\n" + "personId: " + bankAccount2.getPersonId() + "\n" + "name: " + bankAccount2.name + "\n" + "lastName 1: " + bankAccount2.lastName1 + "\n" + "lastName 2: " + bankAccount2.lastName2 + "\n" + "Balance: " + bankAccount2.getBalance() + "\n");
        
        /**
         * Representa la creación de una instancia de la clase información de contacto asociada a la primera instancia de la clase persona creada.
         */
        ContactInformation contactInformation1 = new ContactInformation("Av. 74A # 45-89", "yvahosc@unal.edu.co", person1.getPersonId(), person1.name, person1.lastName1, person1.lastName2);
        
        /**
         * Representa la impresión en consola de la información de la instancia de la clase información de contacto creada.
         */
        System.out.println("Contact information 1" + "\n" + "Address: " + contactInformation1.getAddress() + "\n" + "Email: " + contactInformation1.getEmail() + "\n" + "personId: " + contactInformation1.getPersonId() + "\n" + "name: " + contactInformation1.name + "\n" + "lastName 1: " + contactInformation1.lastName1 + "\n" + "lastName 2: " + contactInformation1.lastName2 + "\n");
        
        /**
         * Representa la creación de una instancia de la clase información de contacto asociada a la segunda instancia de la clase persona creada.
         */
        ContactInformation contactInformation2 = new ContactInformation("Av. 4A # 5-89", "juana@xxxx.co", person2.getPersonId(), person2.name, person2.lastName1, person2.lastName2);
        
        /**
         * Representa la impresión en consola de la información de la otra instancia de la clase información de contacto creada.
         */
        System.out.println("Contact information 2" + "\n" + "Address: " + contactInformation2.getAddress() + "\n" + "Email: " + contactInformation2.getEmail() + "\n" + "personId: " + contactInformation2.getPersonId() + "\n" + "name: " + contactInformation2.name + "\n" + "lastName 1: " + contactInformation2.lastName1 + "\n" + "lastName 2: " + contactInformation2.lastName2 + "\n");
        
        /**
         * Representa la creación de una lista de colores que se usará dentro de las instancias de la clase fruta que se crearan.
         */
        ArrayList colors = new ArrayList(2);
        colors.add("Verde");
        colors.add("Rojo");
        
        /**
         * Representa la creación de una instancia de la clase fruta utilizando la lista de colores creada.
         */
        Fruit fruit1 = new Fruit("Manzana", 0.35f, colors);
        
        /**
         * Representa la impresión en consola de la información de la instancia de la clase fruta creada.
         */
        System.out.println("Fruit 1" + "\n" + "Name: " + fruit1.name + "\n" + "Average weight per unit [Kg]: " + fruit1.getAverageWeight() + "\n" + "Colors: " + fruit1.colors + "\n");
        
        /**
         * Representa la creación de otra instancia de la clase fruta utilizando la lista de colores creada.
         */
        Fruit fruit2 = new Fruit("Uva", 0.012f, colors);
        
        /**
         * Representa la impresión en consola de la información de la otra instancia de la clase fruta creada.
         */
        System.out.println("Fruit 2" + "\n" + "Name: " + fruit2.name + "\n" + "Average weight per unit [Kg]: " + fruit2.getAverageWeight() + "\n" + "Colors: " + fruit2.colors + "\n");
        
        /**
         * Representa la creación de una instancia de la clase características asociada a la primera instancia de la clase fruta creada.
         */
        Features features1 = new Features("Villa de Leyva - Boyacá", 6500, "Golden", fruit1.name, fruit1.getAverageWeight());
        
        /**
         * Representa la impresión en consola de la información de la instancia de la clase características creada.
         */
        System.out.println("Features fruit 1" + "\n" + "Name: " + features1.name + "\n" + "Average weight per unit: " + features1.getAverageWeight() + "\n" + "Origin: " + features1.origin + "\n" + "Price per Kg: " + features1.price + "\n" + "Type: " + features1.type + "\n");
        
        /**
         * Representa la creación de otra instancia de la clase características asociada a la segunda instancia de la clase fruta creada.
         */
        Features features2 = new Features("Valle del Cauca", 13500, "Raisin", fruit2.name, fruit2.getAverageWeight());
        
        /**
         * Representa la impresión en consola de la información de la otra instancia de la clase características creada.
         */
        System.out.println("Features fruit 2" + "\n" + "Name: " + features2.name + "\n" + "Average weight per unit: " + features2.getAverageWeight() + "\n" + "Origin: " + features2.origin + "\n" + "Price per Kg: " + features2.price + "\n" + "Type: " + features2.type + "\n");
        
        /**
         * Representa la creación de una instancia de la clase compra asociada a una instancia de la clase características y dos instancia de la clase cuenta bancaria. 
         */
        Buy buy1 = new Buy(001, 3, features1 , bankAccount1, bankAccount2);
        
        /**
         * Representa la impresión en consola de la información de la instancia de la clase compra creada.
         */
        System.out.println("Buy 1" + "\n" + "Buy Id: " + buy1.getBuyId() + "\n" + "Fruit: " + buy1.feature.name + "\n" + "Number [Kg]: " + buy1.numberOfFruit + "\n" + "Price per Kg: " + buy1.feature.price + "\n" + "Price: " + (buy1.numberOfFruit * buy1.feature.getPrice()) + "\n");
        System.out.println("Buyer" + "\n" + "personId: " + buy1.originAccount.getPersonId() + "\n" + "name: " + buy1.originAccount.name + "\n" + "lastName 1: " + buy1.originAccount.lastName1 + "\n" + "LastName 2: " + buy1.originAccount.lastName2 + "\n" + "Origin Account Number: " + buy1.originAccount.getAccountNumber() + "\n" + "Balance after buy: " + (buy1.originAccount.getBalance() - ((buy1.numberOfFruit * buy1.feature.getPrice()))) + "\n");
        System.out.println("Seller" + "\n" + "personId: " + buy1.destinationAccount.getPersonId() + "\n" + "name: " + buy1.destinationAccount.name + "\n" + "lastName 1: " + buy1.destinationAccount.lastName1 + "\n" + "lastName 2: " + buy1.destinationAccount.lastName2 + "\n" + "Origin Account Number: " + buy1.destinationAccount.getAccountNumber() + "\n" + "Balance after buy: " + (buy1.destinationAccount.getBalance() + ((buy1.numberOfFruit * buy1.feature.getPrice()))) + "\n");
        
        /**
         * Representa la evaluación del cumplimiento en la creación de las clases pedidas en el desarrollo del taller utilizando ciclos anidados.
         */
        if ((person1.getClass() == Person.class) & (person2.getClass() == Person.class)){
            System.out.println("Person 1 and person 2 are of type: " + Person.class + "\n");
            
            if ((bankAccount1.getClass() == BankAccount.class) & (bankAccount2.getClass() == BankAccount.class)){
                System.out.println("Account 1 and Account 2 are of type: " + BankAccount.class + "\n");
            
                if ((contactInformation1.getClass() == ContactInformation.class) & (contactInformation2.getClass() == ContactInformation.class)){
                System.out.println("Contact information 1 and Contact information 2 are of type: " + ContactInformation.class + "\n");
                
                    if ((fruit1.getClass() == Fruit.class) & (fruit2.getClass() == Fruit.class)){
                        System.out.println("Fruit 1 and fruit 2 are of type: " + Fruit.class + "\n");
                    
                        if ((features1.getClass() == Features.class) & (features2.getClass() == Features.class)){
                            System.out.println("Features 1 and Features 2 are of type: " + Features.class + "\n");
                        
                            if ((buy1.getClass() == Buy.class)){
                                System.out.println("Buy 1 is of type: " + Buy.class + "\n");
                                System.out.println("The required classes were created");
                            }
                        }
                    }
                }  
            }     
        }
        else{
            System.out.println("The required classes were not created");
        }
    }
}
