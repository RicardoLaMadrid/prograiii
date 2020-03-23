package Calculadora;

public class Calculadora implements Suma,Resta,Multiplicacion,Division {
    @Override
    public int suma(int a, int b) {

        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }

    public void imprimir(String mensaje, int value)
    {
        System.out.printf("%s %d %s", mensaje,value,"\n");
    }
}
