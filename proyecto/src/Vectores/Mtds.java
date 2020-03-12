package Vectores;
import javafx.scene.transform.Scale;

import java.io.*;
import java.util.Scanner;

public class Mtds implements metodos {

    public void leerVector() throws IOException {
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

    public void Insercion() {
            Scanner numero= new Scanner(System.in);
            int num;
            System.out.print("Ingrese el numero de elementos para el vector: ");
            num=numero.nextInt();
            System.out.println("Ingrese los datos del vector");
            Scanner ordenar = new Scanner(System.in);
            int vector[] = new int[num];
            int aux,x,y;
            for (int i=0;i<num;i++)
            {
                System.out.print("Elemento "+(i+1)+":");
                vector[i]=ordenar.nextInt();
            }
            for (x=1 ; x < vector.length; x++)
            {
                aux = vector[x];

                for (y = x-1; y >=0 && vector [y]>aux ; y --)
                {
                    vector[y+1] = vector [y];
                    vector [y] = aux;
                }
            }



            for (int i=0; i<vector.length; i++)
            {
                System.out.print(vector[i]+ ", ");
            }
            System.out.print("}");
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
    @Override
    public void burbuja() {

    }

    @Override
    public void insercion() {

    }

    @Override
    public void seleccion() {

    }
}
