package com.prograii2020.swing.Gui.Panels;

import com.prograii2020.swing.Gui.Listener.ButtonListener;
import com.prograii2020.swing.Gui.Util.Util;
import com.prograii2020.swing.Model.AlphabetModel;
import com.prograii2020.swing.Service.AlphabetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
public class AlphabetPanel extends JPanel {
    JLabel word,lengu,resul;
    JTextField t1,t2,t3;
    JButton b1,b2;
    @Autowired
    private AlphabetService alphabetService;


    public AlphabetPanel() {
        System.setProperty("butBackColor", "#C1ECF1");
        System.setProperty("textColor", "#0B0BF6");
        this.setPreferredSize(new Dimension(600, 300));
        this.setBackground(Color.darkGray);
        this.setLayout(new GridLayout(5, 0));




        t1 = new JTextField();
        t1.setPreferredSize(new Dimension(90,30));
        t2 = new JTextField();
        t2.setPreferredSize(new Dimension(90,30));

        t3 = new JTextField();
        t3.setPreferredSize(new Dimension(90,30));

        b1 = new JButton("TRANSLATE");
        b1.setPreferredSize(new Dimension(120,30));

        b2 = new JButton("CLEAN");
        b2.setPreferredSize(new Dimension(120,30));
    }

    @PostConstruct
    public void createButtonsLetters() {
        List<AlphabetModel> firstRow = alphabetService.getAllLettersFirst();
        String[] titleAlphabet = firstRow.get(0).getLetter().split(",");
        JPanel panelQ_P = this.createPanelButton(titleAlphabet);
        this.add(panelQ_P);

        List<AlphabetModel> secondRow = alphabetService.getAllLettersSecond();
        String[] titleAlphabet1 = secondRow.get(0).getLetter().split(",");
        JPanel panelA_L = this.createPanelButton(titleAlphabet1);
        this.add(panelA_L);

        List<AlphabetModel> threeRow = alphabetService.getAllLettersThree();
        String[] titleAlphabet2 = threeRow.get(0).getLetter().split(",");
        JPanel panelZ_M = this.createPanelButton(titleAlphabet2);
        this.add(panelZ_M);

        JPanel panel1 = this.createPanel1();
        this.add(panel1);
        JPanel panel2 = this.createPanel2();
        this.add(panel2);
    }

    public JPanel createPanelButton(String[] titleAlphabet) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        ButtonListener listener = new ButtonListener();

        for (String title : titleAlphabet) {
            JButton button = new JButton(title);
            button.setPreferredSize(new Dimension(55, 40));
            button.addActionListener(listener);
            button.setBackground(Color.getColor("butBackColor"));
            button.setForeground(Color.getColor("textColor"));
            button.setBorder(BorderFactory.createEmptyBorder());
         //   button.setFont(Util.FONT_TEXT);
            mainPanel.add(button);
        }
        return mainPanel;

    }

@PostConstruct
    public JPanel createPanel1() {
        JPanel mainPanel1 = new JPanel();
        mainPanel1.setLayout(new FlowLayout());
    word = new JLabel("WORD");
    word.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
    word.setPreferredSize(new Dimension(80,30));
        mainPanel1.add(word);
        mainPanel1.add(t1);
    lengu = new JLabel("LENGUAJE");
    lengu.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
    lengu.setPreferredSize(new Dimension(80,30));
        mainPanel1.add(lengu);
        mainPanel1.add(t2);
    resul = new JLabel("RESULTADO");
    resul.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
    resul.setPreferredSize(new Dimension(80,30));
        mainPanel1.add(resul);
        mainPanel1.add(t3);

        return mainPanel1;
    }

    @PostConstruct
    public JPanel createPanel2() {
        JPanel mainPanel1 = new JPanel();
        mainPanel1.setLayout(new FlowLayout());

        mainPanel1.add(b1);
        mainPanel1.add(b2);


        return mainPanel1;
    }
}
