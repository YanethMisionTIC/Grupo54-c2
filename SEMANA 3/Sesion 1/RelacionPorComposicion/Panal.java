package RelacionPorComposicion;

public class Panal {
    //1. Atributos: ubicacion, coleccion de abejas

    private String ubicacionPanal;
    public Abeja[] enjambre;

    //2. Añadimos el contructor de la clase con todos los args excepto la coleccion.

    public Panal(String ubicacionPanal) {
        this.ubicacionPanal = ubicacionPanal;
        /* Inicializamos la colección de abejas:
        1. Le damos un tamaño
        2. A cada posición de la colección se le asigna una instancia de la clase
        Abeja
        */
        this.enjambre = new Abeja[3];
        this.enjambre[0] = new Abeja("Barry");
        this.enjambre[1] = new Abeja("Larry");
        this.enjambre[2] = new Abeja("Adam");
    }

    //3. Añadimos la función para retornar la información del objeto Panal
    @Override
    public String toString() {
        //Como el enjambre es una colección debemos iterar en ella
        System.out.println("    >>> Cuidado abejas <<< ");
        for (int i = 0; i < this.enjambre.length; i++) {
            System.out.println("Id: " + this.enjambre[i].idAbeja 
                    +", nombre: " + this.enjambre[i].nombre);
        }
        return "{" + "ubicacionPanal: " + ubicacionPanal + '}';
    }
}
