/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1;

import java.util.Scanner;

/**
 *
 * @author YanethM
 */
public class Main {

    //Colores mensajes que se muestran por consola
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        //1. Creamos las instancias de las clases
        Exercise1 instanceExercise1 = new Exercise1();
        Exercise2 instanceExercise2 = new Exercise2();
        Exercise3 instanceExercise3 = new Exercise3();
        Exercise4 instanceExercise4 = new Exercise4();
        Exercise5 instanceExercise5 = new Exercise5();
        Exercise6 instanceExercise6 = new Exercise6();
        Exercise7 instanceExercise7 = new Exercise7();

        //2. Instanciamos la librería Scanner
        Scanner userSelection = new Scanner(System.in);

        //3. Variables para trabajar con el menu de opciones
        int userOption = 0;
        boolean exitMenu = false;

        //4. Creamos el while que contedra la estructura switch
        //Haga lo que hay dentro del while mientras el usuario 
        //no quiera salirse del Menú
        //exitMenu = false;
        //!exitMenu = true;
        while (!exitMenu) {
            //5. Solicitamos y capturamos el valor de la opción ingresada por el user
            System.out.println(ANSI_PURPLE + "                SELECCIONA UNA OPCIÓN DEL MENÚ"+ ANSI_RESET);
            System.out.println("\n1. Ejercicio 1\n2. Ejercicio 2\n3. Ejercicio 3\n4. Ejercicio 4\n5. Ejercicio 5\n6. Ejercicio 6\n7. Ejercicio 7" + ANSI_RED + "\n8. Salir del programa" + ANSI_RESET);
            System.out.println("Opción: ");
            userOption = userSelection.nextInt();
            switch (userOption) {
                case 1:
                    instanceExercise1.RequestDataUser();
                    break;
                case 2:
                    instanceExercise2.EvenOrOddNumber();
                    break;
                case 3:
                    instanceExercise3.EvenOrOddNegativeNumber();
                    break;
                case 4:
                    instanceExercise4.EvenNegativeNumber();
                    break;
                case 5:
                    instanceExercise5.ValidateWifiPassword();
                    break;
                case 6:
                    //instanceExercise6;
                    break;
                case 7:
                    //instanceExercise7;
                    break;
                case 8:
                    exitMenu = true;
                    System.out.println("            >>> Terminando ejecución <<<");
                    break;
                default:
                    System.out.println("ERROR.Las opciones son entre 1 y 8.");
                    break;
            }
        }

    }

}
