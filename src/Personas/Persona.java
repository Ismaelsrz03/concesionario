package Personas;

import java.util.Date;

public class Persona {

	private String nombre;
	private Date fechaNacimineto;
	private String lugarNacimiento;
	
	
	public Persona(String nombre, Date fechaNacimineto, String lugarNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimineto = fechaNacimineto;
		this.lugarNacimiento = lugarNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimineto() {
		return fechaNacimineto;
	}
	public void setFechaNacimineto(Date fechaNacimineto) {
		this.fechaNacimineto = fechaNacimineto;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimineto=" + fechaNacimineto + ", lugarNacimiento="
				+ lugarNacimiento + "]";
	}
	
	
}
