package Introduccion;

import java.util.Scanner;

public class Ejercicios {
    public Scanner leer ;

    public Ejercicios()
    {
        leer = new Scanner(System.in);

    }
    public void serie1(int n)
    {
        for (int i =0;i<20;i++)
        {
            System.out.println(i);
        }
    }
    public void compara (String cad1,String cad2)
    {
        if(cad1.equals(cad2))
        {
            System.out.println("cadenas iguales");
        }
        else
        {
            System.out.println("cadenas distintas");
        }
    }
    public void serie2(int n)
    {
        for (int i = 0;i<n;i++)
        {

                if(i%2 ==0)
                {
                    System.out.printf("%d ",i+2);
                }
                else
                {
                    System.out.printf(" %d",i);
                }
//

        }
    }
}
