package HITO2.ExamenHito2;

public class Policia extends Persona {
    public String turno ;
    public int nroDestinos;
    public String [] destinos;
    public int nropoli;
    public String mos1;
    public Policia()
    {
        this.turno = "";
        this.nroDestinos = 0;

    }
    public void leer() {
            super.leer();
            System.out.printf("Ingrese Turno :");
            turno = LEER.next();

            System.out.println("Ingrese Numero de Destinos : ");
            this.nroDestinos = LEER.nextInt();
            this.destinos = new String[this.nroDestinos];

            for (int i = 0; i < nroDestinos; i++) {
                System.out.printf("Ingrese Destinos : ");
                this.destinos[i] = LEER.next();
                System.out.println();
            }
    }

    public void mostrar()
    {
        super.mostrar();
        System.out.printf(", Turno : %s, Numero de Destinos : %d, Destinos :%s %s ",turno,nroDestinos,destinos,"\n");
           for (int j = 0; j < this.nroDestinos; j++) {
               System.out.printf("  Destino %d: %s", (j + 1), destinos[j]);
           }

       }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNroDestinos() {
        return nroDestinos;
    }

    public void setNroDestinos(int nroDestinos) {
        this.nroDestinos = nroDestinos;
    }

    public String[] getDestinos() {
        return destinos;
    }

    public void setDestinos(String[] destinos) {
        this.destinos = destinos;
    }
}




