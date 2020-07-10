package graficos;

import java.awt.event.*;

import javax.swing.JFrame;

public class EventoRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton miMarco = new MarcoRaton();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		
		setVisible(true);
		setBounds(700, 300, 600,450);
		EventosDeRaton eventoRaton = new EventosDeRaton();
		addMouseListener(eventoRaton);
		
		
	}
}

class EventosDeRaton extends MouseAdapter{

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("Has hecho click");
		
	}

	
}
