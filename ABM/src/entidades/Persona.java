package entidades;

public class Persona {
	private String nombre,apellido,dni;
	private boolean habilitado;
	
	public Persona(){
		nombre=null;
		apellido=null;
		dni=null;
		habilitado=false;
	}
	
	public Persona(String nombre, String apellido, String dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.habilitado=true;	
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	
	

}
