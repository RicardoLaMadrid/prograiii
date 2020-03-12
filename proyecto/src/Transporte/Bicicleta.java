package Transporte;

public class Bicicleta implements Vehiculo {
    private int nroRuedas;
    private String color;
    public void nroRuedas()
    {
        System.out.printf("Nro de ruedas de la bicicleta %d\n",this.getNroRuedas());
    }

    @Override
    public void color() {

    }

    public void Color()
    {
        System.out.printf("Color de la bicicleta %s\n",this.getColor());
    }
    public void setNroRuedas(int nroRuedas)
    {
        this.nroRuedas = nroRuedas;

    }
    public int getNroRuedas()
    {
        return this.nroRuedas;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return  this.color;
    }
}
