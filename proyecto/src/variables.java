import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;

public class variables {
    //public int edad;
    //private String password="123456PWD" ;
    public static void main(String[] args) {
        int edad=20;
        String password="123456PWD" ;
        double decimal=2.4;
        String a = "Mi primer programa";
        String b = "desde Java";
        System.out.println(edad);
        System.out.println(password);
        System.out.println(decimal);

       System.out.printf("la variabe edad %d es un numero\n", edad);
       System.out.printf("Mi primer programa \ndesde java\n");
       System.out.printf("%s \n %s\n",a,b );

       //si tengo 6 manzanas y 3 personas a cada persona le toca a 2 manzanas
        int x=6,c=3,calculo;
        calculo = x/c;
        System.out.printf("Si tengo %d manzanas y %d personas a cada persona le toca %d manzanas",x,c,calculo);


    }
}
