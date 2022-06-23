package Principal;

import Herencia.*;

public class Main {

    public static void main(String[] args) {
        /*
        =============================================================================
        ===================================Manager==================================
        =============================================================================
         */
        Manager managerInst = new Manager("Sistemas", 4500000, "Contador público", false, "Marco", "de la Puerta", "C.C.", "805310888", "marco@gmail.com", "Bucaramanga");
        System.out.println(managerInst.toString());
        /*
        =============================================================================
        ===================================Operator==================================
        =============================================================================
         */
        Operator operatorInst = new Operator(5, "31/12/2022", 1700000, "Operario de máquina", true, "Hamilton", "Ruiz", "P.E.P.", "716354", "hamilton@gmail.com", "Medellín");
        System.out.println(operatorInst.toString());
    }
}
