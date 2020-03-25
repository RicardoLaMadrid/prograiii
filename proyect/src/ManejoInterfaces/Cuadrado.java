package ManejoInterfaces;

public class Cuadrado  {
    private double PI;
    private double area;


    public void areacuadrado (int lado,int alto)
    {

        area = lado*alto;
        System.out.printf("El area del cuadrado es %d \n",area);

    }
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
}
