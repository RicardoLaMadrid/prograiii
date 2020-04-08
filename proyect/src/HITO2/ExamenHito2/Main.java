package HITO2.ExamenHito2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Policia {
    public static void main(String[] args) {
        Scanner LEER = new Scanner(System.in);

//        Ciudadano c = new Ciudadano();
//        Persona pe = new Persona();
        Profesor pr1 = new Profesor();
        Profesor pr2 = new Profesor();
        pr1.leer();
        pr1.mostrar();
        pr2.leer();
        pr2.mostrar();
        Policia po1 = new Policia();
        Policia po2 = new Policia();
        po1.leer();
        po1.mostrar();
//        po2.leer();
//        po2.mostrar();

        pr1.verificaMateria(pr1.getMaterias(),pr2.getMaterias());
        System.out.printf( pr1.verificaCiudad(po1.getDestinos()));

    }
    public void comprobar (String Destino, String NombreDep )
    {


    }
}













//
//















//        Scanner sn = new Scanner(System.in);
//        boolean salir = false;
//        int opcion; //Guardaremos la opcion del usuario
//
//        while (!salir) {
//
//            System.out.println("1. Ciudadano");
//            System.out.println("2. Persona");
//            System.out.println("3. Policia");
//            System.out.println("4. Profesor");
//            System.out.println("5. Instanciar");
//            System.out.println("6. Verificar si 2 profesores tienen la misma materia");
//            System.out.println("7. Verificar si la ciudad de un profesor pertenece a uno de los destinos del policia");
//            System.out.println("8. Salir");
//
//            try {
//
//                System.out.println("Escribe una de las opciones");
//                opcion = sn.nextInt();
//
//                switch (opcion) {
//                    case 1:
//                        System.out.println("Has seleccionado la opcion 1");
//                        c.leer();
//                        c.mostrar();
//
//                        break;
//                    case 2:
//                        System.out.println("Has seleccionado la opcion 2");
//                        pe.leer();
//                        pe.mostrar();
//                        break;
//                    case 3:
//                        System.out.println("Has seleccionado la opcion 3");
//                        po.leer();
//                        po.mostrar();
//                        break;
//                    case 4:
//                        System.out.println("Has seleccionado la opcion 4");
//                        pr.leer();
//                        pr.mostrar();
//                        break;
//                    case 5:
//                        System.out.println("Has seleccionado la opcion 5");
//                        po.leer();
//                        pr.leer();
//                        po.mostrar();
//                        pr.mostrar();
//
//
//                        break;
//                    case 6:
//                        System.out.println("Has seleccionado la opcion 6");
//                        pr.leer();
//                        pr.mostrar();
//                        pr.leer();
//                        pr.mostrar();
//
//
//
//
//                        break;
//                    case 7:
//                        System.out.println("Has seleccionado la opcion 7");
//
//                        po.destino();
//
//
//
//
//                        break;
//                    case 8:
//                        salir = true;
//                        break;
//                    default:
//                        System.out.println("Solo números entre 1 y 8");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Debes insertar un número");
//                sn.next();
//            }
//        }




