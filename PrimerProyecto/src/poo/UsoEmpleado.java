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
		
		System.out.println(jefaFinanzas.tomarDecisiones("Dar más dias de vacaciones a los empleados"));
		System.out.println("El jefe " + jefaFinanzas.getNombre() + " tiene un bonus de " + jefaFinanzas.estableceBonus(500));
		System.out.println(misEmpleados[2].getNombre() + " tiene un bonus de " + misEmpleados[2].estableceBonus(250));
		for(Empleado e : misEmpleados) {
			e.setAumentoSueldo(5);
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e : misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() + " Fecha de alta: " + e.getAltaContrato());
		}
	}
}
class Empleado implements Comparable, Trabajadores{
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente;
	
	
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		this.altaContrato = calendario.getTime();
		this.id = ++idSiguiente;
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
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
	
	public double estableceBonus(double gratificacion) {
		
		return Trabajadores.bonusBase + gratificacion;
	}
	
}

	class Jefatura extends Empleado implements Jefes{
	
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
	
	public String tomarDecisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision " + decision;
		
	}
	
	public double estableceBonus(double gratificacion) {
		
		double prima = 2000;
		return Trabajadores.bonusBase + gratificacion + prima;
	}
}

