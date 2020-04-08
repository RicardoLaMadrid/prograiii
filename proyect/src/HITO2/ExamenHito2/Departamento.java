package HITO2.ExamenHito2;
                   import java.util.Scanner;
public class Departamento {
    public String[] NombreDep;
    public int Cantidad;
    Scanner LEER = new Scanner(System.in);

    public void Policia() {

        this.Cantidad = 0;
    }

    public void leer() {


        System.out.println("Ingrese Numero de Departamentos : ");
        Cantidad = LEER.nextInt();
        NombreDep = new String[Cantidad];
        for (int i = 0; i < Cantidad; i++) {
            System.out.printf("Ingrese Destinos : ");
            NombreDep[i] = LEER.next();
            System.out.println();
        }
                  
    }
    public void mostrar()
    {

        System.out.printf(", Numero de Departamentos : %d, Departamentos :%s %s ", Cantidad, NombreDep,"\n");
        for (int j = 0; j < Cantidad; j++) {
            System.out.printf("  Departamento %d: %s", (j + 1), NombreDep[j]);
        }

    }
}