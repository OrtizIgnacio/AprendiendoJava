package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Jefatura jefeRRHH = new Jefatura("Ignacio Ortiz", 100000, 2020, 6, 26);
		jefeRRHH.setIncentivo(20000);
		Empleado [] misEmpleados = new Empleado[5];
		
		misEmpleados[0] = new Empleado("Natalia Calcagno", 30000, 2020, 6, 24);
		misEmpleados[1] = new Empleado("Carlos Varela", 35000, 2020, 6, 24);
		misEmpleados[2] = new Empleado("Benito Ortiz", 40000, 2020, 6, 24);
		misEmpleados[3] = jefeRRHH;
		misEmpleados[4] = new Jefatura("Maria Rosa Ortiz", 90000, 2020, 6, 26);
		
		Jefatura jefaFinanzas = (Jefatura)misEmpleados[4];
		jefaFinanzas.setIncentivo(15000);
		
		for(Empleado e : misEmpleados) {
			e.setAumentoSueldo(5);
		}
		
		
		
		for(Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + " Fecha de alta: " + e.getAltaContrato());
		}
	}
}
class Empleado{
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		this.altaContrato = calendario.getTime();
	}
	public String getNombre() {
		return this.nombre;
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

final class Jefatura extends Empleado{
	
	private double incentivo;
	
	public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
		
		super(nombre, sueldo, anio, mes, dia);
		
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	public double getSueldo() {
		
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}
}

