package HITO2.ExamenHito2;

public class Profesor extends Persona {

    public int cargaH;
    public String ciudad;
    public int nroMaterias;
    public String Materias ;

    public Profesor()
    {
        this.cargaH = 0;
        this.ciudad = "";
        this.nroMaterias = 0;
        this.Materias = "";

    }

    public void leer() {
        super.leer();
        System.out.printf("Ingrese Carga Horaria :");
        cargaH = LEER.nextInt();
        System.out.printf("Ingrese Ciudad :");
        ciudad = LEER.next();

        int i;
        int[] numeros = new int[3];

        System.out.println("Ingrese Numero de Materias : ");
        nroMaterias = LEER.nextInt();

        for (i = 0; i < 3; i++) {
            System.out.print("Ingrese Materias :[" + i + "]= ");
            Materias = LEER.next();
//            numeros[i] = LEER.nextInt();
        }





    }

    public void mostrar()
    {
        super.mostrar();
        System.out.printf(", Carga Horaria :%d, Ciudad : %s, Numero de Materias : %d, Materias :%s %s ",cargaH,ciudad,nroMaterias,Materias,"\n");

    }



    public void verificamateria()
    {
        Materias = LEER.next();
      if (Materias == Materias)
      {
          System.out.printf("tienen la misma materia :%s",Materias);
      }
      else
      {
          System.out.printf("no hay coincidencias");
      }

    }

    public void cciudad()
    {
        System.out.printf("Ingrese Ciudad :");
        ciudad = LEER.next();
        System.out.printf(" Ciudad : %s,  %s ",ciudad,"\n");
    }
}
