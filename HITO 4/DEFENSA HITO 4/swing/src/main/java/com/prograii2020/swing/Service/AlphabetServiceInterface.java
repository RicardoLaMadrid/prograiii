package com.prograii2020.swing.Service;

import com.prograii2020.swing.Model.AlphabetModel;

import java.util.List;


public interface AlphabetServiceInterface {
    public void saveData();
    public List<AlphabetModel> getAllLettersFirst();
    public List<AlphabetModel> getAllLettersSecond();
    public List<AlphabetModel> getAllLettersThree();
}
