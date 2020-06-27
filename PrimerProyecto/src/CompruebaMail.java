import javax.swing.*;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0;
		
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		for(int i = 0; i < mail.length(); i++) {
			
			if(mail.charAt(i) == '@') {
				
				arroba++;
				
			}
			if(mail.charAt(i) == '.') {
				
				punto = true;
				
			}
			
		}
		if(arroba == 1 && punto == true) {
			
			System.out.println("El mail es correcto");
			
		}
		else {
			
			System.out.println("El mail no es correcto");
			
		}
	}

}
