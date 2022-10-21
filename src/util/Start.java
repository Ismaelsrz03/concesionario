package util;

import java.util.Date;

import Coches.Coche;
import Personas.Persona;

public class Start {

	public static void main(String[] args) {

		Persona persona = new Persona("Ismael",new Date(),"Mieres");
		
		Coche coche = new Coche(persona);
		
		coche.setConsumo(2.4f);
		coche.setPuertas(5);
		System.out.println(coche);
	}

}
