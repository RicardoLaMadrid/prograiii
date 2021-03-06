package com.prograii2020.swing.Gui.Frame;

import com.prograii2020.swing.Gui.Panels.AlphabetPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class FrameMain extends JFrame {

    @Autowired
    private AlphabetPanel alphabetPanel;


    public FrameMain() {
        this.setTitle("PROGRA III 2020");
        this.setBounds(300, 200, 800, 600);
        this.setBackground(Color.blue);
        this.setLayout(new GridLayout(2, 0));


    }

    @PostConstruct
    public void createPanelsMainFrame() {
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout());
        addPanels(container);
        this.add(container);
        this.setVisible(true);

    }

    public void addPanels(JPanel container) {
        container.add(alphabetPanel);

    }
}

