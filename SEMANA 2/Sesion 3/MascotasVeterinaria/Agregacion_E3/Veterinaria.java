package Agregacion_E3;

public class Veterinaria {

    private String razonSocial;
    private String nit;
    public Mascota[] mascotas;

    public Veterinaria() {
    }

    public Veterinaria(String razonSocial, String nit, Mascota[] mascotas) {
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        System.out.println("Mascotas[");
        for (int i = 0; i < this.mascotas.length; i++) {
            System.out.println("    " + this.mascotas[i].idMascota
                    + " " + this.mascotas[i].nombre + " "
                    + this.mascotas[i].raza
            );
        }
        return "]\nVeterinaria\n  {" + "\n       razonSocial=" + razonSocial
                + ",\n       nit=" + nit
                + "\n  }";
    }

}
