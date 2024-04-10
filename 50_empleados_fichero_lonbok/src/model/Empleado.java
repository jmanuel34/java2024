package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Empleado {
	private int codigo;
	private String nombre;
	private String email;
	private int edad;

	
}
