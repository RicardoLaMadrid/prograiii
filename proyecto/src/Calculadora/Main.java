package Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.imprimir("La suma es:",cal.suma(5,5));
        cal.imprimir("La resta es:",cal.resta(15,5));
        cal.imprimir("La multiplicacion es:",cal.multiplicacion(2,5));
        cal.imprimir("La multiplicacion es:",cal.division(10,2));
    }
}
