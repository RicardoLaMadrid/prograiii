package HerenciaVehiculos;

public class Vehiculo {


    public String placa;
    public int nrRuedas;
    public int nrAsientos;

    public Vehiculo(String placa,int nrRuedas,int nrAsientos){
        this.placa = placa;
        this.nrRuedas = nrRuedas;
        this.nrAsientos = nrAsientos;
    }
    public String getPlaca() {
        return placa;
    }

    public int getNrRuedas() {
        return nrRuedas;
    }

    public int getNrAsientos() {
        return nrAsientos;
    }

}
