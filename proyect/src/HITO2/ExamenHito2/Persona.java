package HITO2.ExamenHito2;

public class Persona extends Ciudadano {

    public String etapaCrecimiento;

    public Persona()
    {
        this.etapaCrecimiento="";

    }
    public void leer() {
        super.leer();
        System.out.printf("Ingrese su Etapa de Crecimiento :");
        etapaCrecimiento = LEER.next();
    }

    public void mostrar()
    {
        super.mostrar();
        System.out.printf(", Etapa Crecimiento : %s %s",etapaCrecimiento,"\n");

    }

}
