package Herencia;

public class Persona implements InterfacePersona{
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
    public java.lang.String getNombres() {
        return nombres;
    }
    public java.lang.String getApellidos() {
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public String getCI(String ci){
        return null;
    }


    @Override
    public String nombres() {
        return null;
    }

    @Override
    public String apellidos() {
        return null;
    }

    @Override
    public int edad() {
        return 0;
    }

    @Override
    public String CI() {
        return null;
    }
}
