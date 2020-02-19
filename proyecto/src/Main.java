import Introduccion.Ejercicios;

import java.util.Scanner;

public class Main {
   public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
       Ejercicios ejercicios = new Ejercicios();

//       ejercicios.serieNaturales(20);
//       ejercicios.compara2cadenas("hola","holamundo");
//       ejercicios.serie(20);

        String o,n = "serie1",m="serie2",x="compara";
        System.out.println("serie1");
        System.out.println("serie2");
        System.out.println("compara");
        System.out.println("Elija una opcion");

        while (leer.hasNext())
        {
            o = leer.next();
           if (o==n)
           {
               ejercicios.serie1(20);
           }
            if (o==m)
            {
                ejercicios.serie2(20);
            }
            if (o==x)
            {
                ejercicios.compara("hola","hola mundo");
            }
        }
    }
}

