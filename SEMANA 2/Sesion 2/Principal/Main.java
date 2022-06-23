package Principal;

import Herencia.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputDataUser = new Scanner(System.in);
        /*
        =============================================================================
        ===================================Employee==================================
        =============================================================================
         */
        Employee employeeInst = new Employee(2500000, "Ingeniero de sistemas", true, "Jacinto", "Ruiz", "C.C.", "75310888", "jacinto@gmail.com", "Manizales");
        Employee employeeInst1 = new Employee(4500000, "Contador público", true, "Marco", "de la Puerta", "C.C.", "805310888", "marco@gmail.com", "Bucaramanga");
        //Imprimimos el objeto que acabamos de crear
        System.out.println(employeeInst.toString());
        System.out.println(employeeInst1.toString());
    }
}
