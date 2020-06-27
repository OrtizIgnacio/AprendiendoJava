
public class ManipulacionCadenasDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		
		String fraseResumen = frase.substring(0, 29) + " irnos a la playa y fue XD " + " y " + frase.substring(29, 57);
		
		System.out.println(fraseResumen);
	}

}
