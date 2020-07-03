package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		boolean estaLaFuente = false;
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente : nombresDeFuentes) {
			if(nombredelafuente.equals(fuente)) {
				estaLaFuente = true;
			}
		}
		if(estaLaFuente) {
			System.out.println("Fuente instalada");
		}else {
			System.out.println("No está instalada la fuente");
		}
		
	}

}
