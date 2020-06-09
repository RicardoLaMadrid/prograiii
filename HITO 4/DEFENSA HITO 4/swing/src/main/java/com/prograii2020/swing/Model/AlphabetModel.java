package com.prograii2020.swing.Model;
import com.prograii2020.swing.Service.AlphabetService;
import javax.persistence.*;

@Entity
@Table (name = "Alphabet")
public class AlphabetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "letter", length = 200, nullable = false)
    private String letter;

    @Column(name = "typeR", length = 100, nullable = false)
    private String typeR;

    public AlphabetModel() {

    }

    public AlphabetModel(String letter, String typeR) {
        this.letter = letter;
        this.typeR = typeR;
    }

    public String getTypeR() {
        return typeR;
    }

    public void setTypeR(String typeR) {
        this.typeR = typeR;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}