package Agregacion_E3;

public class Mascota {
    public int idMascota;
    public String nombre;
    public String raza;
    public static int contadorMasc;

    public Mascota(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.idMascota = ++Mascota.contadorMasc;
    }
   
}
