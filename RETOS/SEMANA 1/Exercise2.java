/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;
import java.util.Scanner;
        
/**
 *Crear un programa donde el usuario ingresa un número 
 * y el sistema valida si es número es par o impar.
 * @author YanethM
 */
public class Exercise2 {
    //1. Creamos la instancia de la librería Scanner
    Scanner inputDataUser = new Scanner(System.in);
    
    //2. Identificar las variables que necesitamos
    private int number = 0;
    
    //3. Creamos el método de validación
    public void EvenOrOddNumber(){
        //4. Solicitamos el dato al usuario
        System.out.println("            VALIDAR SI EL NÚMERO ES PAR O IMPAR");
        System.out.println("                Número:");
        number = inputDataUser.nextInt();
        //5. Con el operador modular "%" validamos si el residuo de la división
        // da igual a cero, si si es par, de lo contrario es impar.
        if(number % 2 == 0){
            System.out.println("El número " + number + " es par.");
        }else{
            System.out.println("El número " + number + " es impar.");
        }
    }
}
