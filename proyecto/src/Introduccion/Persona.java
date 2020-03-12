package Introduccion;

import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //sirve para pedir valores al usuario

//        System.out.println("ingrese su nombre");
//        String niNombre = leer.nextLine();
//        System.out.println("ingrese su apellido");
//        String miApellido = leer.nextLine();
//
//        System.out.printf("Su nombre completo es:%s %s\n",niNombre,miApellido);
//        System.out.println("ingrese su edad");
//        int miEdad = leer.nextInt();
//        System.out.printf("Su edad es: %d",miEdad);

       // sumar las primeras cinco edades
//        int sumaedades = 0,miEdad2=0,contador=0,promedio=0;
//        System.out.println("ingrese su edad");
//        while(leer.hasNextInt())
//        while(contador<5)
//        {
//         miEdad2 = leer.nextInt();
//            System.out.println("Su edad es: " + miEdad2 );
//            System.out.println("Ingrese su edad ");
//           contador=contador+1;
//         sumaedades = sumaedades + miEdad2;
//         promedio = sumaedades / contador ;
//
//        }
//        System.out.println("suma total de edades es :"+sumaedades);
//        System.out.println("el promedio de las edades es:"+promedio);
//
//
//        int numero1 = 20;
//
//        if(numero1 % 2 == 0)
//        {
//            System.out.printf("el numero %d es par\n",numero1);
//        }
//        else {
//                System.out.printf("el numero %d es impar\n",numero1);
//        }
//
//        String name = "prograiii";
//        if (name == "prograiii")
//        {
//            System.out.printf("las cadena %s es igual\n",name);
//        }
//        else
//        {
//            System.out.printf("las cadena %s es distinta\n",name);
//        }
//
//        for(int i =0;i<10;i++)
//        {
//            System.out.println(i);
//        }
        int credit_number ;
        System.out.printf("ingrese un monto:");

       while(leer.hasNextInt())
        {

            credit_number = leer.nextInt();

            if (credit_number > 50000) {
                System.out.printf("PLATINUM\n");
            }
            if (credit_number >= 10000 && credit_number <= 50000)
            {
                System.out.printf("GOLD\n");
            }
            if (credit_number < 10000) {
                System.out.printf("SILVER\n");
            }
            System.out.printf("ingrese un monto:");
        }
    }
}
