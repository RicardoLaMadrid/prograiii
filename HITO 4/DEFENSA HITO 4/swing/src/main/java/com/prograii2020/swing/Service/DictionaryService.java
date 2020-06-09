package com.prograii2020.swing.Service;

import com.prograii2020.swing.Model.AlphabetModel;
import com.prograii2020.swing.Model.DictionaryModel;
import com.prograii2020.swing.Repo.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.net.JarURLConnection;
import java.util.List;

@Service
public class DictionaryService implements DictionaryServiceInterface{
//    private static final String Monday = "Monday";
//    private static final String Tuesday = "Tuesday";
//    private static final String Wednesday = "Wednesday";
//    private static final String Thursday = "Thursday";
//    private static final String Friday = "Friday";
//    private static final String Saturday = "Saturday";
//    private static final String Sunday = "Sunday";
//    private static final String SegundaFeira = "Segunda_Feira";
//    private static final String Terca = "Terca-Feira";
//    private static final String Quarta = "Quarta-Feira";
//    private static final String Quinta = "Quinta-Feira";
//    private static final String Sexta = "Sexta-Feira";
//    private static final String SabadoP = "Sabado";
//    private static final String DomingoP = "Domingo";
//    private static final String Lunes = "Lunes";
//    private static final String Martes = "Martes";
//    private static final String Miercoles = "Miercoles";
//    private static final String Jueves = "Jueves";
//    private static final String Viernes = "Viernes";
//    private static final String Sabado = "Sabado";
//    private static final String Domingo = "Domingo";


    @Autowired
    private DictionaryRepository dictionaryRepository;

    @Override
    public void saveData() {
        if (dictionaryRepository.count() == 0) {
//            dictionaryRepository.save(new DictionaryModel(Monday,SegundaFeira,Lunes));
//            dictionaryRepository.save(new DictionaryModel(Tuesday,Terca,Martes));
//            dictionaryRepository.save(new DictionaryModel(Wednesday,Quarta,Miercoles));
//            dictionaryRepository.save(new DictionaryModel(Thursday,Quinta, Jueves));
//            dictionaryRepository.save(new DictionaryModel(Friday,Sexta,Viernes));
//            dictionaryRepository.save(new DictionaryModel(Saturday,SabadoP,Sabado));
//            dictionaryRepository.save(new DictionaryModel(Sunday,DomingoP,Domingo));


            dictionaryRepository.save(new DictionaryModel("Monday","Segunda-Feira","Lunes"));
            dictionaryRepository.save(new DictionaryModel("Tuesday","Terca-Feira","Martes"));
            dictionaryRepository.save(new DictionaryModel("Wednesday","Quarta-Feira","Miercoles"));
            dictionaryRepository.save(new DictionaryModel("Thursday","Quinta-Feira","Jueves"));
            dictionaryRepository.save(new DictionaryModel("Friday","Sexta-Feira","Viernes"));
            dictionaryRepository.save(new DictionaryModel("Saturday","Sabado","Sabado"));
            dictionaryRepository.save(new DictionaryModel("Sunday","Domingo","Domingo"));

        }
    }

    @Override
    public List<DictionaryModel> getAllEnglis() {
        return null;
    }

    @Override
    public List<DictionaryModel> getAllPortugues() {
        return null;
    }

    @Override
    public List<DictionaryModel> getAllWord() {
        return null;
    }
}
