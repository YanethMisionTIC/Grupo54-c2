package Ejecutor;

import Herencia.*;
import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        Scanner inputDataUser = new Scanner(System.in);
        
        //1. Instancia que llama el contructor vacío de la clase Person
        //personName = null, lastname = null, documentType = null, document = null, email = null, cityResidence = null
        Person emptyInstance = new Person();
        //2. Instancia que llama el contructor que recibe 2 params de la clase Person
        //personName = "Lola", lastname = "Mento", documentType = null, document = null, email = null, cityResidence = null
        Person completeNameInstance = new Person("Lola", "Mento");
        
        //3. Instancia que llama el contructor que recibe todos los params de la clase Person
        //personName = "Marco", lastname = "de la Puerta", documentType = "C.C.", document = "75430330", email = "marcodelapuerta@gmail.com", cityResidence = "Manizales"
        Person informationCompleteInstance = new Person("Marco", "de la Puerta", "C.C.", "75430330", "marcodelapuerta@gmail.com", "Manizales");
        
        
        
        //Consultar el nombre de la persona utilizando las 3 instancias
        System.out.println(emptyInstance.getPersonName()); //null
        System.out.println(completeNameInstance.getPersonName()); //Lola
        System.out.println(informationCompleteInstance.getPersonName()); //Marco
        
        
        System.out.println(emptyInstance.toString());
        System.out.println(completeNameInstance.toString());
        System.out.println(informationCompleteInstance.toString());
        
        //Solicitamos al usuario su nombre y apellido
        System.out.println("Nombre: ");
        String personNameI = inputDataUser.nextLine();
        
        System.out.println("Apellido: ");
        String lastnameI = inputDataUser.nextLine();
        
        emptyInstance.setPersonName(personNameI);
        //emptyInstance.setLastname(lastnameI);
        
        Person completeNameInstance2 = new Person(personNameI, lastnameI);
        
        System.out.println(emptyInstance.toString());
        System.out.println(completeNameInstance2.toString());
        /*
        
            Un objeto person sería:
                {
                    personName = "",
                    lastname = "",
                    documentType = "",
                    document = "",
                    email = "",
                    cityResidence = ""
                }
        */
    }
}
