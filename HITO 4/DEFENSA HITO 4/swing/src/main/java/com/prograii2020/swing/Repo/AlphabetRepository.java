package com.prograii2020.swing.Repo;

import com.prograii2020.swing.Service.AlphabetService;
import com.prograii2020.swing.Model.AlphabetModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface AlphabetRepository extends JpaRepository<AlphabetModel, Integer> {

    @Query(value="SELECT * FROM alphabet WHERE typer ='first';", nativeQuery=true)
    public List<AlphabetModel> getFirstRow();

    @Query(value="SELECT * FROM alphabet WHERE typer ='second';", nativeQuery=true)
    public List<AlphabetModel> getSecondRow();

    @Query(value="SELECT * FROM alphabet WHERE typer ='three';", nativeQuery=true)
    public List<AlphabetModel> getThreeRow();
}