package Herencia;

public class Persona{
    public String nombres;
    public String apellidos;
    public String CI;
    public int edad;


    public Persona(String nombres,String apellidos,int edad,String CI){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.CI = CI;

    }
    public void setCI(String ci){
        this.CI=ci;

    }

}
