package RelacionPorAgregacion;

public class Pato {
    //1. Atributos: contador, nombre
    protected int idPato;
    protected String nombre;
    protected static int contadorPatos;
    
    //2. Añadimos el constructor de la clase con TODOS los atributo
    public Pato(String nombre) {
        this.nombre = nombre;
        this.idPato = ++Pato.contadorPatos;
    }
}
