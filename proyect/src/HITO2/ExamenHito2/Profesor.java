package HITO2.ExamenHito2;

public class Profesor extends Persona {

    public int cargaH;
    public String ciudad;
    public int nroMaterias;
    public String [] Materias ;

    public Profesor()
    {
        this.cargaH = 0;
        this.ciudad = "";
        this.nroMaterias = 0;

    }

    public void leer() {
        super.leer();
        System.out.printf("Ingrese Carga Horaria :");
        this.cargaH = LEER.nextInt();
        System.out.printf("Ingrese Ciudad :");
        this.ciudad = LEER.next();
        System.out.println("Ingrese Numero de Materias : ");
        this.nroMaterias = LEER.nextInt();
        this.Materias = new String[this.nroMaterias];

        for (int i = 0; i < nroMaterias; i++) {
            System.out.printf("Ingrese Materias : ");
            this.Materias[i]=LEER.next();
            System.out.println();
//            numeros[i] = LEER.nextInt();
        }





    }

    public void mostrar()
    {
        super.mostrar();
        System.out.printf(", Carga Horaria :%d, Ciudad : %s, Numero de Materias : %d, Materias :%s %s ",cargaH,ciudad,nroMaterias,Materias,"\n");
        for (int j = 0; j < this.nroMaterias; j++)
        {
            System.out.printf("Materia %d: %s",(j +1),this.Materias[j]);
        }
    }
    public void verificaMateria(String[]materia1,String[]materia2){
        for(int i=0;i<materia1.length;i++)
        {
            if(materia1.equals(materia2)){
                System.out.printf("Si ienen la misma Materia");
            }
            else {
                System.out.printf("No tienen la misma Materia");
            }
        }
    }
public String verificaCiudad(String[] destinos){
        String respuesta="No trabajaron en la misma ciudad";
        for(int i=0;i<destinos.length;i++)
        {
            if(this.ciudad.equals(destinos[i])){
                respuesta="Si trabaja en esa ciudad";
            }
        }
        return respuesta;
}

    public int getCargaH() {
        return cargaH;
    }

    public void setCargaH(int cargaH) {
        this.cargaH = cargaH;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNroMaterias() {
        return nroMaterias;
    }

    public void setNroMaterias(int nroMaterias) {
        this.nroMaterias = nroMaterias;
    }

    public String[] getMaterias() {
        return Materias;
    }

    public void setMaterias(String[] materias) {
        Materias = materias;
    }
}
