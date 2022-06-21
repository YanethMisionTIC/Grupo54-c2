/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;
//1. Importar la librería Scanner

import java.util.Scanner;

/**
 *
 * @author YanethM
 */
public class Exercise1 {

    //2. Crear la instancia de la librería Scanner
    Scanner inputDataUser = new Scanner(System.in);
    //3. Identificar las variables necesarias en la clase
    private String userName = "";
    private char gender = 'F';
    private int age = 0;

    public void RequestDataUser() {
        System.out.println("            DATOS PERSONALES");
        System.out.println("                Nombre:");
        userName = inputDataUser.nextLine();

        System.out.println("                Edad:");
        age = inputDataUser.nextInt();

        System.out.println("                Género:\n                   F. Femenino\n                   M. Masculino\n                   O. Otro");
        gender = inputDataUser.next().charAt(0);

        //4. Validación de entradas por parte del usuario
        if (age >= 18) {
            if (gender == 'F' || gender == 'f') {
                System.out.println(userName + " género femenino mayor de edad");
            } else if (gender == 'M' || gender == 'm') {
                System.out.println(userName + " género masculino mayor de edad");
            } else if (gender == 'O' || gender == 'o') {
                System.out.println(userName + " otro tipo de género mayor de edad");
            } else {
                System.out.println("Error. Género ingresado no existe en la lista.");
            }
        } else {
            if (gender == 'F' || gender == 'f') {
                System.out.println(userName + " género femenino menor de edad");
            } else if (gender == 'M' || gender == 'm') {
                System.out.println(userName + " género masculino menor de edad");
            } else if (gender == 'O' || gender == 'o') {
                System.out.println(userName + " otro tipo de género menor de edad");
            } else {
                System.out.println("Error. Género ingresado no existe en la lista.");
            }
        }

    }
}
