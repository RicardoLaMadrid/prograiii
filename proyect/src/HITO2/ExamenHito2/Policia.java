package HITO2.ExamenHito2;

public class Policia extends Persona {
    public String turno ;
    public int nroDestinos;
    public String destinos;

    public Policia()
    {
        this.turno = "";
        this.nroDestinos = 0;
        this.destinos = "";
    }
    public void leer() {
        super.leer();
        System.out.printf("Ingrese Turno :");
        turno = LEER.next();


        int i;
        int[] numeros = new int[3];

        System.out.println("Ingrese Numero de Destinos : ");
        nroDestinos = LEER.nextInt();

        for (i = 0; i < 3; i++) {
            System.out.print("Ingrese Destinos :[" + i + "]= ");
            destinos = LEER.next();
//            numeros[i] = LEER.nextInt();
        }

    }

    public void mostrar()
    {
        super.mostrar();
        System.out.printf(", Turno : %s, Numero de Destinos : %d, Destinos :%s ",turno,nroDestinos,destinos,"\n");

    }

    public void destino()
    {
        int i;
        int[] numeros = new int[3];

        System.out.println("Ingrese Numero de Destinos : ");
        nroDestinos = LEER.nextInt();

        for (i = 0; i < 3; i++) {
            System.out.print("Ingrese Destinos :[" + i + "]= ");
            destinos = LEER.next();
//            numeros[i] = LEER.nextInt();
        }
        System.out.printf(" Destinos :%s ",destinos,"\n");

    }
}
