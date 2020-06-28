package poo;

import java.util.*;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona [] personas = new Persona[2];
		
		personas[0] = new EmpleadoDos("Ignacio Ortiz", 35000, 2020, 06, 29);
		personas[1] = new Alumno("Ignacio Ortiz", "Tecnicatura en sistemas");
		
		for(Persona x : personas) {
			System.out.println(x.getNombre() + " " + x.dameDescripcion());
		}
		
	}

}

abstract class Persona{
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}

class EmpleadoDos extends Persona{
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente;
	
	
	public EmpleadoDos(String nombre, double sueldo, int anio, int mes, int dia) {
		super(nombre);
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		this.altaContrato = calendario.getTime();
		this.id = ++idSiguiente;
	}

	public String dameDescripcion() {
		return "Este empleado tiene un id igual a " + this.id + " con un sueldo igual a " + this.sueldo;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}
	public Date getAltaContrato() {
		return this.altaContrato;
	}
	public void setAumentoSueldo(double porcentaje) {
		double aumento = sueldo * (porcentaje/100);
		sueldo += aumento;
	}
}

class Alumno extends Persona{
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
		this.carrera = carrera;
	}
	
	public String dameDescripcion() {
		return "El alumno esta estudiando la carrera de " + this.carrera;
	}
	
	private String carrera;
}