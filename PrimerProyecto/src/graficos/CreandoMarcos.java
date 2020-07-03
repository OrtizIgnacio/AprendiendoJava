package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiMarco marcoUno = new MiMarco();
		
		marcoUno.setVisible(true);
		
		marcoUno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MiMarco extends JFrame{
	
	public MiMarco() {
	
		//setSize(500, 300);
		//setLocation(500, 300);
		setBounds(500, 300, 550, 250);
		setTitle("Nati te amo");
		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
	}
	
	
}