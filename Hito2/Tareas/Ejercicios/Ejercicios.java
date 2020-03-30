package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ejercicios {

    Scanner scn = new Scanner(System.in);
    public void Fibonacci()
    {
        int a=0,b=1,x,y;
        System.out.printf("Ingrese la cantidad de elemntos: ");
        x = scn.nextInt();
        for(int i=0; i<x;i++)
        {
            System.out.println(a);
            y = a+b;
            a = b;
            b = y;

        }

    }
    public void Burbujas() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n Ingrese Numero de elementos para el vector: ");
        int tam = Integer.parseInt(in.readLine());
        int arr[] = new int[tam];
        System.out.println();
        int j = 0;
        for (int i = 0 ; i < arr.length;i++)
        {
            j+=1;
            System.out.print("Elemento " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine());
        }
        burbuja(arr);
    }
    static void burbuja(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] > arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]+"\n");
        }
    }

    public void Seleccion() {

        Scanner numero=new Scanner(System.in);

        int num;

        System.out.print("Ingrese el numero de elementos para el vector: ");

        num=numero.nextInt();

        int vector[] = new int[30];

        int aux;

        for (int i=0;i<num;i++)

        {
            System.out.print("Elemento"+(i+1)+":");
            vector[i]=numero.nextInt();
        }
        for (int i = 0; i < num - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < num; j++)
            {
                if (vector[j] < vector[min])
                {
                    min = j;
                }
            }
            if (i != min)
            {
                aux= vector[i];
                vector[i] = vector[min];
                vector[min] = aux;
            }
        }

        for (int i=0;i<num;i++)
        {
            System.out.print(vector[i]+ ", ");
        }
        System.out.print("}");

    }

    public void arrays()
    {
        int i;
        int[] numeros = new int[10];
        double par = 0;


        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = scn.nextInt();
        }
        if (numeros[i]%2==0 )
        {
            System.out.printf("Pares:"+numeros[i]);
        }

    }

}
