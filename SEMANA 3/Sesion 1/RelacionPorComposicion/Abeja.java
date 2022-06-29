package RelacionPorComposicion;

public class Abeja {
//1. Atributos: contador, nombre

    protected int idAbeja;
    protected String nombre;
    protected static int contadorAbejas;

    public Abeja(String nombre) {
        this.nombre = nombre;
        this.idAbeja = ++Abeja.contadorAbejas;
    }
}
