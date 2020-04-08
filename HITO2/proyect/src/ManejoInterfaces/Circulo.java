package ManejoInterfaces;

public class Circulo  implements Figura{

    private double PI;
    private double area;

//    public void areacirculo (double r)
//    {
//
//        area = PI * r * r;
//        System.out.printf("El area del circulo es %d \n",area);
//    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }


    public double area(double r) {
        area = PI * r * r;
        System.out.printf("El area del circulo es %d \n",area);
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }
}
