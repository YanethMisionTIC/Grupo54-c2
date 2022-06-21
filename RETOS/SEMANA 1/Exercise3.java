/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 * Crear un programa donde el usuario ingresa un número y el sistema valida si
 * es número es par o impar. El número ingresado debe ser negativo.
 *
 * @author YanethM
 */
public class Exercise3 {

    //1. Creamos la instancia de la librería Scanner
    Scanner inputDataUser = new Scanner(System.in);

    //2. Identificar las variables que necesitamos
    private int number = 0;

    //3. Creamos el método de validación
    public void EvenOrOddNegativeNumber() {
        //4. Solicitamos el dato al usuario
        System.out.println("            VALIDAR SI EL NÚMERO ES PAR O IMPAR Y NEGATIVO");
        System.out.println("                Número:");
        number = inputDataUser.nextInt();
        
        //5. Primero validamos en un condicional superior si es negativo o no
        // dentro de este condicional, validamos si es un número par o impar.
        if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("El número " + number + "es negativo par.");
            } else {
                System.out.println("El número " + number + "es negativo impar.");
            }
        } else {
            System.out.println("ERROR. No cumple la restricción de ser NEGATIVO.");
        }
    }
}
