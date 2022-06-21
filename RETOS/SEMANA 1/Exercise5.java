/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 * Crear un programa que solicita al usuario la contraseña de su wifi, la cual
 * es “ABC123”, sólo tendrá 3 intentos. Al 3 intento incorrecto, el sistema le
 * mostrará un mensaje indicando que ha sido bloqueado.
 *
 * @author YanethM
 */
public class Exercise5 {

    //1. Crear la instancia de la librería Scanner
    Scanner inputDataUser = new Scanner(System.in);
    //2. Identificar las variables que necesitamos
    private String wifiPassword = "";
    private int numberAttempts = 1;

    //3. Creamos el método de validación
    public void ValidateWifiPassword() {
        System.out.println("            VALIDAR CONTRASEÑA WIFI");
        //4. Solicitud y captura del valor ingresado por el usuario
        //La primer solicitud de la contraseña del wifi, no cuenta entre los 3 
        //intentos, por esta razón el condicional del while va hasta menor que 3
        System.out.println("                Password:");
        wifiPassword = inputDataUser.nextLine();

        //5. Validar si la contraseña ingresada es igual a ABC123
        //Para validar si una cadena de texto es igual a otra NO SE DEBE UTILIZAR ==
        while (numberAttempts < 3) {
            if (wifiPassword.equals("ABC123")) {
                //Mensaje caso éxitoso:
                System.out.println("Conectado a la red WIFI de tu casa.");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Password: ");
                wifiPassword = inputDataUser.nextLine();
                if (numberAttempts == 2) {
                    System.out.println("*************Usuario sido bloqueado.*************");
                }
            }
            numberAttempts += 1;
            //numberAttempts = numberAttempts + 1
        }

    }
}
