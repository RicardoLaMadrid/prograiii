package Proyect.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ProyectoApplication extends JFrame {

	private JTextArea ChatArea = new JTextArea();
	private JTextField ChatBox = new JTextField();

	public ProyectoApplication(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("ChatBot");
		frame.add(ChatArea);
		frame.add(ChatBox);

		ChatArea.setSize(500,400);
		ChatArea.setLocation(2,2);

		ChatBox.setSize(540,30);
		ChatBox.setLocation(2,500);

		ChatBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				String gtext = ChatBox.getText().toLowerCase();
				ChatArea.append("YOU ->"+ gtext +"\n");
				ChatBox.setText("");

				if(gtext.contains("hola"))
				{
					bot("Hola");
				}
				else if (gtext.contains("¿como estas?")||gtext.contains("como estas?"))
				{
					bot("Bien gracias, tu como estas?");
				}
				else if (gtext.contains("igual bien gracias, cuentame sobre el lenguaje java"))
				{
					bot("Java es un lenguaje de programación y una plataforma informática que fue \n " +
							  "comercializada por primera vez en 1995 por Sun Microsystems.\n " +
							  "Hay muchas aplicaciones y sitios web que no funcionarán, probablemente,\n" +
							  " a menos que tengan Java instalado y cada día se crean más. Java es rápido,\n" +
							  " seguro y fiable.Desde portátiles hasta centros de datos,\n" +
							  " desde consolas para juegos hasta computadoras avanzadas,\n " +
							  "desde teléfonos móviles hasta Internet, Java está en todas partes,\n " +
							  "si es ejecutado en una plataforma no tiene que ser recompilado para correr en otra.\n" +
							  "Java es, a partir de 2012, uno de los lenguajes de programación más populares en uso, \n" +
							  "particularmente para aplicaciones de cliente-servidor de web,\n" +
							  " con unos diez millones de usuarios reportados.");
				}
			}
		});

	}
	private void bot(String string){
		ChatArea.append("Bot ->" +string+ "\n");


	}
	public static void main(String[] args) {

		new ProyectoApplication();
	}



}
