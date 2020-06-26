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
    @Autowired
    private DictionaryRepository dictionaryRepository;

    @Override
    public void saveData() {
        if (dictionaryRepository.count() == 0) {


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
