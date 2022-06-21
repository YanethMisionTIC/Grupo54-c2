/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 * Crear un programa donde el usuario ingresa un número y el sistema valida si
 * es número es par negativo, de lo contrario vuelve a solicitarle el número,
 * hasta que cumpla dicha restricción.
 *
 * @author YanethM
 */
public class Exercise4 {
    //1. Creamos la instancia de la librería Scanner

    Scanner inputDataUser = new Scanner(System.in);

    //2. Identificar las variables que necesitamos
    private int number = 0;

    //3. Creamos el método de validación
    public void EvenNegativeNumber() {
        //4. Solicitamos el dato al usuario
        System.out.println("            VALIDAR SI EL NÚMERO ES PAR NEGATIVO");
        System.out.println("                Número:");
        number = inputDataUser.nextInt();
        
        //5. Solicitamos el ingreso del número si no es par negativo
        while (number >= 0 || number % 2 != 0) {
            System.out.println("ERROR. El número no es negativo o no es par.");
            System.out.println("                Nuevo número:");
            number = inputDataUser.nextInt();
        }
        System.out.println("El número " + number + " es par negativo");
    }
}
