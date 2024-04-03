/*
 * 1: Se pide el nómbre, email, edad y código del empleado. Si no existe empleado con ese código, 	 
 * se guarda, pero si el código ya existe, no se guarda y se muestra advertencia al usuario
 * 
 * 



 */

package model;


public class Empleado {
	private Integer codigo;
	private String nombre;
	private int edad;
	private String email;
	
	public Empleado() {
		super();
	}

	public Empleado(int codigo, String nombre, int edad, String email) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
