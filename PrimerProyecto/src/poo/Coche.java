package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero;
	private boolean climatizador;
	
	public Coche() {
		
		this.ruedas = 4;
		this.largo = 2000;
		this.ancho = 300;
		this.motor = 1600;
		this.pesoPlataforma = 500;
		
	}
	
	public int getAncho(){
		return this.ruedas;	
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return "El color del coche es " + this.color;
	}

	@Override
	public String toString() {
		return "La plataforma del vehiculo tiene " + this.ruedas + " ruedas" + ". Mide " + this.largo/1000 + " metros con un ancho de " + this.ancho + " cm y un peso de plataforma de " + this.pesoPlataforma + " kilos";
	}
	
	public void setAsientosCuero(String asientosCuero) {
		if(asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true; 
		}else {
			this.asientosCuero = false;
		}
		
	}

	public String getAsientosCuero() {
		if(this.asientosCuero == true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void setClimatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador = true;
			
		}else {
			
			this.climatizador = false;
		
		}
	}
	
	public String getClimatizador() {
		
		if(this.climatizador == true) {
			
			return "El coche incorpora climatizador";
		
		}else {
			
			return "El coche lleva aire acondicionado";
		
		}
	}
	
	public String dimePesoCoche() {//setter y getter
		
		int pesoCarroceria = 500;
		
		this.pesoTotal = this.pesoPlataforma + pesoCarroceria;
		
		if(this.asientosCuero == true) {
			
			this.pesoTotal = this.pesoTotal +50;
		}
		if(this.climatizador == true) {
			
			this.pesoTotal = this.pesoTotal + 20;
		}
		
		return "El peso del coche es " + this.pesoTotal;
	}

	public int precioCoche() {
		
		int precioFinal = 10000;
		
		if(this.asientosCuero == true) {
			
			precioFinal += 2000;
		
		}
		if(this.climatizador == true) {
			
			precioFinal += 1500;
		
		}
		
		return precioFinal;
	}
	
}
