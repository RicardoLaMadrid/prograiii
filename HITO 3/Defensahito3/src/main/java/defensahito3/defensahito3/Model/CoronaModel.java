package defensahito3.defensahito3.Model;

import javax.persistence.*;


@Entity
@Table(name = "coronaviruspaciente")
public class CoronaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_corona_virus;
    @Column(name = "nombre_dep")
    private String nombre_dep;
    @Column(name = "nombre_paciente")
    private String nombre_paciente;
    @Column(name = "apellidos_paciente")
    private String apellidos_paciente;
    @Column(name = "edad_paciente")
    private int edad_paciente;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "casos_contagiados")
    private int casos_contagiados;
    @Column(name = "casos_sospechosos")
    private int casos_sospechosos;
    @Column(name = "casos_recuperados")
    private int casos_recuperados;

    public int getId_corona_virus() {
        return id_corona_virus;
    }

    public void setId_corona_virus(Integer id_corona_virus) {
        this.id_corona_virus = id_corona_virus;
    }

    public String getNombre_dep() {
        return nombre_dep;
    }

    public void setNombre_dep(String nombre_dep) {
        this.nombre_dep = nombre_dep;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getApellidos_paciente() {
        return apellidos_paciente;
    }

    public void setApellidos_paciente(String apellidos_paciente) {
        this.apellidos_paciente = apellidos_paciente;
    }

    public int getEdad_paciente() {
        return edad_paciente;
    }

    public void setEdad_paciente(Integer edad_paciente) {
        this.edad_paciente = edad_paciente;
    }

    public int getCasos_contagiados() {
        return casos_contagiados;
    }

    public void setCasos_contagiados(Integer casos_contagiados) {
        this.casos_contagiados = casos_contagiados;
    }

    public int getCasos_sospechosos() {
        return casos_sospechosos;
    }

    public void setCasos_sospechosos(Integer casos_sospechosos) {
        this.casos_sospechosos = casos_sospechosos;
    }

    public int getCasos_recuperados() {
        return casos_recuperados;
    }

    public void setCasos_recuperados(Integer casos_recuperados) {
        this.casos_recuperados = casos_recuperados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
