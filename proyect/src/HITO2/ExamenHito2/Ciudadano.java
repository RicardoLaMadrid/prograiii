package HITO2.ExamenHito2;

public class Ciudadano implements Leerinterface {
public String primerNombre;
public String primerApellido;
public int ciNumber;
public String ciExt;
public int edad;

public Ciudadano() {
    this.primerNombre = "";
    this.primerApellido = "";
    this.ciNumber = 0;
    this.ciExt = "";
    this.edad = 0;
}
    public void leer() {
        System.out.printf("Ingrese Primer Nombre :");
        primerNombre = LEER.next();
        System.out.printf("Ingrese Primer Apellido :");
        primerApellido = LEER.next();
        System.out.printf("Ingrese Numero CI :");
        ciNumber = LEER.nextInt();
        System.out.printf("Ingrese Extencio CI :");
        ciExt = LEER.next();
        System.out.printf("Ingrese Numero su Edad :");
        edad = LEER.nextInt();

    }

    public void mostrar ()
    {

        System.out.printf("Nombre: %s, Apellido: %s, NumeroCI: %d, ExtensionCI: %s, Edad: %d",primerNombre,primerApellido,ciNumber,ciExt,edad);
    }

}
