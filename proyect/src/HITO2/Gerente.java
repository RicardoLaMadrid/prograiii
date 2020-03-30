package HITO2;

import java.io.*;
import java.util.Scanner;
import sun.management.jmxremote.SingleEntryRegistry;

public class Gerente extends Empleado {

    public int nroID;
    public String codArea;
    public int sueldoBasico;

    public Gerente() {
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
        System.out.printf("Ingrese Numero de ID :");
        nroID = LEER.nextInt();
        System.out.printf("Ingrese Codigo de Area :");
        codArea = LEER.next();
        System.out.printf("Ingrese Sueldo Basico :");
        sueldoBasico = LEER.nextInt();

   }

    public void Mostrar ()
    {
        System.out.printf("Nombre: %s, Apellido: %s, NumeroCI: %d, ExtensionCI: %s, NroID: %d, CodArea: %s, SueldoBasico: %d",primerNombre,primerApellido,ciNumero,ciExtension,nroID,codArea,sueldoBasico);
    }


}
