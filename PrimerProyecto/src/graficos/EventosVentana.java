package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoVentana miMarco = new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoVentana miMarcoDos = new MarcoVentana();
		miMarcoDos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miMarco.setTitle("Ventana UNO");
		miMarcoDos.setTitle("Ventana DOS");
		miMarco.setBounds(300, 300, 500, 350);
		miMarcoDos.setBounds(900, 300, 500, 350);
		
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setTitle("Respondiendo");
		//setBounds(300, 300, 500, 350);
		setVisible(true);
		//MiVentana oyenteVentana = new MiVentana();
		//addWindowListener(oyenteVentana);
		
		addWindowListener(new MiVentana());
		
	}
}

class MiVentana extends WindowAdapter{
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}
	
	
	
}