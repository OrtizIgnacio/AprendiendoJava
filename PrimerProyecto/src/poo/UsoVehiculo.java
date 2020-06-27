package poo;



public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche miCocheUno = new Coche();
		miCocheUno.setColor("Rojo");
		
		Furgoneta miFurgonetaUno = new Furgoneta(7, 580);
		
		miFurgonetaUno.setColor("Azul");
		miFurgonetaUno.setAsientosCuero("Si");
		miFurgonetaUno.setClimatizador("si");
		
		System.out.println(miCocheUno.toString() + " " + miCocheUno.getColor());
		System.out.println(miFurgonetaUno.toString() + miFurgonetaUno.dimeDatosFurgoneta());
		
	}

}
