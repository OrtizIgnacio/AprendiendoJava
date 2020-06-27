import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "NachoMunro";
		
		String pass = "";
		
		while(clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introduce una contraseña, por favor");
			
			if(clave.equals(pass) == false) {
				
				System.out.println("Contraseña incorrecta");
				
			}
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
