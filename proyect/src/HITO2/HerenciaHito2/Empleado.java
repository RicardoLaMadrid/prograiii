package HITO2.HerenciaHito2;

public class Empleado implements leerInterface {
    public String primerNombre;
    public String primerApellido;
    public int ciNumero;
    public String ciExtension;

    public Empleado() {
        super();
    }

    public void leer() {
        System.out.printf("Ingrese Primer Nombre :");
        primerNombre = LEER.next();
        System.out.printf("Ingrese Primer Apellido :");
        primerApellido = LEER.next();
        System.out.printf("Ingrese Numero CI :");
        ciNumero = LEER.nextInt();
        System.out.printf("Ingrese Extencio CI :");
        ciExtension = LEER.next();

    }

    public void Mostrar ()
    {
        System.out.printf("Nombre: %s, Apellido: %s, NumeroCI: %d, ExtensionCI: %s",primerNombre,primerApellido,ciNumero,ciExtension);
    }
}
