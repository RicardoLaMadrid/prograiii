package HITO2;



public class Mensajero extends Oficinista {

    public String turno;



    public Mensajero() {
        super();
    }
    public void leer() {
        System.out.printf("Ingresar turno:");
        turno = LEER.next();


    }
    public void mostrar() {
        System.out.printf("turno:%s",turno);

    }

}
