package RelacionPorAgregacion;


public class Lago {
    //1. Atributos: nombreLago, ubicación y colección de patos que contiene
    private String nombreLago;
    private String ubicacion;
    //Creamos atributo de relación con la clase Pato
    public Pato [] patos;
    
    //2. Agregamos por sobrecarga dos constructores de la clase
    public Lago() {
    }

    public Lago(String nombreLago, String ubicacion, Pato[] patos) {
        this.nombreLago = nombreLago;
        this.ubicacion = ubicacion;
        this.patos = patos;
    }
    
    //3. Añadimos función toString para mostrar la información de la clase Lago

    @Override
    public String toString() {
        //patos es una colección por ende la debemos de recorrer para mostrar
        //su contenido
        //Iteramos desde la posición 0 hasta la cantidad de patos que tiene el lago
        for (int i = 0; i < this.patos.length; i++) {
            //De momento no se muestra la información del pato {id, nombre}
            System.out.println("Pato n°: " + this.patos[i].idPato +", nombre: "
                                + this.patos[i].nombre);
        }
        return "Lago{" + "nombreLago: " + nombreLago 
                + ", ubicacion: " + ubicacion + '}';
    }
    
}
