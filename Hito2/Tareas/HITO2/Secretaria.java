package HITO2;

public class Secretaria extends Oficinista {

    public String nombreArea;

    public Secretaria() {
        super();
    }
    public void leer() {
        System.out.printf("Ingresar nombreArea:");
        nombreArea = LEER.next();


    }
    public void mostrar() {
        System.out.printf("nombreArea:%s",nombreArea);

    }
}
