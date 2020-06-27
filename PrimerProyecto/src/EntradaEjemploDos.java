import javax.swing.*;
public class EntradaEjemploDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
			
			String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
			
			int edadUsuario = Integer.parseInt(edad);
			
			edadUsuario++;
			
			System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + edadUsuario + " años");
			
	}

}
