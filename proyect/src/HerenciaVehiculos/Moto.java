package HerenciaVehiculos;

public class Moto extends Vehiculo{

    public Moto(String placa,int nrRuedas,int nrAsientos){
        super(placa, nrRuedas, nrAsientos);


    }
    public void mostrarDatos(){
        System.out.printf("Placa:"+placa+"\n nrRuedas: "+nrRuedas+"\n nrAsientos:"+nrAsientos);

    }
}
