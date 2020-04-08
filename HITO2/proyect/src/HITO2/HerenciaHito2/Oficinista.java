package HITO2.HerenciaHito2;

public class Oficinista extends Empleado {

    public String codArea;
    public int sueldoBasico;


    public Oficinista() {
        super();
    }
    public void leer() {
        System.out.printf("Ingresar codArea:");
        codArea = LEER.next();
        System.out.printf("Ingresar sueldoBasico:");
        sueldoBasico = LEER.nextInt();

    }
    public void mostrar() {
        System.out.printf("codArea:%s, sueldoBasico:%d",codArea,sueldoBasico);

    }


}
