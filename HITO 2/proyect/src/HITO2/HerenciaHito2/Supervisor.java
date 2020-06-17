package HITO2.HerenciaHito2;

public class Supervisor extends Empleado {

public int sueldo;
public int antiguedad ;

    public Supervisor() {
        super();
    }
    public void leer() {

        System.out.printf("Ingresar sueldo:");
        sueldo = LEER.nextInt();
        System.out.printf("Ingresar antiguedad:");
        antiguedad = LEER.nextInt();

    }
    public void mostrar() {

        System.out.printf("Sueldo:%d, Antiguedad:%d",sueldo,antiguedad);

    }


}
