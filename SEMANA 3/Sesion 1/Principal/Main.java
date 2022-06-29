package Principal;

import Sobreescritura.*;
import Sobrecarga.*;
import Polimorfismo.*;
import ClasesAbstractas.*;

public class Main {

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
        System.out.println(ANSI_PURPLE + "**** PRACTICA DE CIERRE SEMANA II ****" + ANSI_RESET);

        /*================================================================================*/
 /*======Ejercicio de sobreescritura===========================================*/
 /*================================================================================*/
        System.out.println(ANSI_BLUE + "\n      >>> SOBREESCRITURA <<<" + ANSI_RESET);
        System.out.println(">>> Superclase: Empleado");
        Empleado emp1 = new Empleado("Juan", 3800000, 0.1);
        System.out.println(emp1.obtenerDetallesF());
        //Mostramos la información del salario con bonificación del empleado
        System.out.println("        Salario con bono: $" + emp1.calcularSalarioConBono());
        System.out.println(">>> Subclase: Gerente");
        Gerente ger1 = new Gerente("Federico", 7500000, 0.2, "Contabilidad", 5);
        System.out.println(ger1.obtenerDetallesF());
        System.out.println("        Salario con bono: $" + ger1.calcularSalarioConBono());
        System.out.println(">>> Subclase: Operario");
        Operario oper1 = new Operario("Jacinto", 2400000, 0.08, true);
        System.out.println(oper1.obtenerDetallesF());
        System.out.println("        Salario con bono: $" + oper1.calcularSalarioConBono());

        /*================================================================================*/
 /*======Ejercicio de sobrecarga===========================================*/
 /*================================================================================*/
        System.out.println(ANSI_BLUE + "\n      >>> SOBRECARGA <<<" + ANSI_RESET);
        EmpleadoS emp2 = new EmpleadoS();
        System.out.println(">>> Constructor vacío");
        System.out.println(emp2.toString());
        System.out.println(">>> Constructor que recibe los args: Nombre y salario");
        EmpleadoS emp3 = new EmpleadoS("Maria Teresa", 6000000);
        System.out.println(emp3.toString());
        System.out.println(">>> Constructor que recibe TODOS los args");

        EmpleadoS emp4 = new EmpleadoS("Marcos ", 3500000, 0.1, true);
        System.out.println(emp4.toString());
        System.out.println("        Salario con bono: $" + emp4.bonoAnual());

        EmpleadoS emp5 = new EmpleadoS("Marcos ", 3500000, 0.1, true);
        System.out.println("        Salario con bono y horas extra: $" + emp5.bonoAnual(230000));

        EmpleadoS emp6 = new EmpleadoS("Marcos ", 3500000, 0.1, true);
        System.out.println("        Bono, horas extra y dotación: $" + emp6.bonoAnual(100000, true));

        /*================================================================================*/
 /*======Ejercicio de polimorfismo===========================================*/
 /*================================================================================*/
        //Para los siguientes ejemplos de polirmofismo utilizaremos el mismo
        //nombre de instancia emp7 asignandole nuevas instancias
        System.out.println(ANSI_BLUE + "\n      >>> POLIMORFISMO <<<" + ANSI_RESET);
        EmpleadoP emp7 = new EmpleadoP("Adiela", 5400000, false);
        //Llamamos el método imprimirInfoEmpleados y le pasamos como param la instancia
        imprimirInfoEmpleados(emp7);

        emp7 = new GerenteP("Jose", 2900000, false, "Sistemas", 7);
        imprimirInfoEmpleados(emp7);

        emp7 = new OperarioP("Uriel", 2400000, true, true);
        imprimirInfoEmpleados(emp7);

        /*================================================================================*/
 /*======Ejercicio de abstracción===========================================*/
 /*================================================================================*/
        System.out.println(ANSI_BLUE + "\n      >>> ABSTRACCION <<<" + ANSI_RESET);
        Circulo circulo = new Circulo("Circulo");
        circulo.dibujarFigura();
        Rectangulo rectangulo = new Rectangulo("Rectangulo");
        rectangulo.dibujarFigura();
    }

    /*================================================================================*/
 /*======Método de polimorfismo===========================================*/
 /*================================================================================*/
    //creamos método que llama todas las funciones o métodos de la clase
    //padre que estan por sobreescrtura en las clases que son hijo
    public static void imprimirInfoEmpleados(EmpleadoP empleado) {
        String llamarFuncion = empleado.obtenerDetallesF();
        System.out.println("        Empleado: " + llamarFuncion);
    }

}
