import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "NachoMunro";
		
		String pass = "";
		
		while(clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introduce una contraseņa, por favor");
			
			if(clave.equals(pass) == false) {
				
				System.out.println("Contraseņa incorrecta");
				
			}
		}
		
		System.out.println("Contraseņa correcta. Acceso permitido");

	}

}
