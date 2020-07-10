package graficos;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFoco miCuadro = new MarcoFoco();
		miCuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setVisible(true);
		setBounds(300, 300, 600, 450);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		setLayout(null);
		cuadroUno = new JTextField();
		cuadroDos = new JTextField();
		
		cuadroUno.setBounds(120, 10, 150, 20);
		cuadroDos.setBounds(120, 50, 150, 20);
		
		add(cuadroUno);
		add(cuadroDos);
		LanzaFocos elFoco = new LanzaFocos();
		cuadroUno.addFocusListener(elFoco);
		
		
	}
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("He perdido el foco");
		}
	}
	
	JTextField cuadroUno;
	JTextField cuadroDos;
}


	
	

