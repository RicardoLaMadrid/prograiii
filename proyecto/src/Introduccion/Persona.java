package Introduccion;

import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);//sirve para pedir valores al usuario

        System.out.println("ingrese su nombre");
        String niNombre = leer.nextLine();
        System.out.println("ingrese su apellido");
        String miApellido = leer.nextLine();

        System.out.printf("Su nombre completo es:%s %s\n",niNombre,miApellido);
        System.out.println("ingrese su edad");
        int miEdad = leer.nextInt();
        System.out.printf("Su edad es: %d",miEdad);

       // sumar las primeras cinco edades
        int sumaedades = 0,miEdad2=0,contador=0,promedio=0;
        System.out.println("ingrese su edad");
        while(leer.hasNextInt())
        while(contador<5)
        {
         miEdad2 = leer.nextInt();
            System.out.println("Su edad es: " + miEdad2 );
            System.out.println("Ingrese su edad ");
           contador=contador+1;
         sumaedades = sumaedades + miEdad2;
         promedio = sumaedades / contador ;

        }
        System.out.println("suma total de edades es :"+sumaedades);
        System.out.println("el promedio de las edades es:"+promedio);



    }
}
