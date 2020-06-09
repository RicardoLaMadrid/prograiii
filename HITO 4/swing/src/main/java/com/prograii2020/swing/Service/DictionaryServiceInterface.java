package com.prograii2020.swing.Service;

import com.prograii2020.swing.Model.AlphabetModel;
import com.prograii2020.swing.Model.DictionaryModel;

import java.util.List;

public interface DictionaryServiceInterface {
    public void saveData();
    public List<DictionaryModel> getAllEnglis();
    public List<DictionaryModel> getAllPortugues();
    public List<DictionaryModel> getAllWord();
}
