package com.prograii2020.swing;

import com.prograii2020.swing.Service.AlphabetService;
import com.prograii2020.swing.Service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SwingApplication {

    @Autowired
    private AlphabetService alphabetService;
    @Autowired
    private DictionaryService dictionaryService;

    public static void main(String[] args) {
        SpringApplicationBuilder springApp = new SpringApplicationBuilder(SwingApplication.class);
        springApp.headless(false);
        springApp.run(args);
    }

    @PostConstruct
    public void init() {

        dictionaryService.saveData();
        alphabetService.saveData();
    }
}