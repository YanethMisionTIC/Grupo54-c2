package RelacionPorAgregacion;
import RelacionPorComposicion.*;


public class Main2 {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    //psvm + tab
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "\n      >>> AGREGACIÓN <<<" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "    *** Ejemplo laguna que tiene patos ***"+ ANSI_RESET);
        /*
        1. Creamos una instancia de la clase Lago utilizando el constructor vacío
        2. Asignar mediante la instancia creada a la colección de patos la cantidad
        que va a contener
        3. Creamos las instancias patos necesarias, según el tamaño que se da a la colección
        En este ejemplo la colección tiene un tamaño de 3, por ende se crean 3 patos
        4. Asignamos cada una de las instancias pato creadas a una posición de la colección
        de patos
        5. Creamos la segunda instancia de la clase Lago utilizando el constructor con TODOS 
        los args
        */
        Lago lagoVacio = new Lago();
        lagoVacio.patos = new Pato[3];
        
        Pato pato1 = new Pato("Donald");
        Pato pato2 = new Pato("Hugo");
        Pato pato3 = new Pato("Luis");
        
        lagoVacio.patos[0] = pato1;
        lagoVacio.patos[1] = pato2;
        lagoVacio.patos[2] = pato3;
        
        Lago lagoConPatos = new Lago("Laguna Negra", "Inframundo", lagoVacio.patos);
        System.out.println(lagoConPatos.toString());
        
        System.out.println(ANSI_BLUE + "\n      >>> COMPOSICIÓN <<<" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "    *** Ejemplo de un panal que contiene abejas ***"+ ANSI_RESET);
        
        Panal panalCasa = new Panal("Patio de la casa ");
        System.out.println(panalCasa.toString());
    }
}
