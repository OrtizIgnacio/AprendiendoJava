import java.util.*;

public class UsoTallas {

	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE}
	
	enum Talla{
		
		MINI("S") , MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String dameAbreviatura() {
			return this.abreviatura;
		}
		
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla");
		String entradaDatos = entrada.next().toUpperCase();
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		System.out.println("Talla " + laTalla);
		System.out.println("Abreviatura " + laTalla.dameAbreviatura());

		
	}

}
