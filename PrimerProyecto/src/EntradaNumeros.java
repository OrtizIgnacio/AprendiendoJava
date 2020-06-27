import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numeroUno = JOptionPane.showInputDialog("Introduce un numero, por favor");
		
		double numeroDos = Double.parseDouble(numeroUno);
		
		System.out.print("La raiz de " + numeroDos + " es ");
		System.out.printf("%1.4f", Math.sqrt(numeroDos));
		
	}

}
