package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Persona;

public class Lista {
	private List<Persona> lista= new ArrayList<Persona>();
	
/*	public void addPibe(){
		Persona pibe=new Persona();
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el nombre sin el apellido");
		pibe.setNombre(sc.nextLine());
		System.out.println("Introduzca el apellido");
		pibe.setApellido(sc.nextLine());
		System.out.println("Introduzca el DNI");
		pibe.setDni(sc.nextLine());
		pibe.setHabilitado(true);
		
		
	}*/
	
	public void addPibe(String nombre,String apellido,String dni){
		Persona pibe=new Persona(nombre,apellido,dni);
		lista.add(pibe);
	}
	
	public Persona seekPibe(String dni){
		for (Persona persona : lista) {
			if(persona.getDni().equals(dni)^!persona.isHabilitado()){
				return persona;
			}			
		}
		return null;
		
	}
	
	public void killPibe(String dni){
		Persona pibe=new Persona();
		pibe=this.seekPibe(dni);
		pibe.setHabilitado(false);						
	}
	
}
