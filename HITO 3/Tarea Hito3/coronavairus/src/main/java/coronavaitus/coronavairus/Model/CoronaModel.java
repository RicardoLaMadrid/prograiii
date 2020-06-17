package coronavaitus.coronavairus.Model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "coronavirus")
public class CoronaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_corona_virus;
    @Column(name = "nombre_dep", length = 50, nullable = false)
    private String nombre_dep;
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

}
