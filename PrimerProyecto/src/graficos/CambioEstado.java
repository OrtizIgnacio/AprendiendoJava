package graficos;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado miMarco = new MarcoEstado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setVisible(true);
		setBounds(300, 300, 500, 350);
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);
		
	}
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("La ventana a cambiado de estado");
		//System.out.println(e.getNewState());
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			
			System.out.println("La ventana esta a pantalla completa");
		
		}else if(e.getNewState() == Frame.NORMAL) {
			
			System.out.println("La ventana esta normal");
		
		}else if(e.getNewState() == Frame.ICONIFIED) {
			
			System.out.println("La ventana esta minimizada");
		}
	}
}