package principal;

import java.time.LocalDateTime;

public class Prueba2 {

	public static void main(String[] args) {
		// Mostrar la fecha y hora que será dentro de 
		// 1 mes, 11 dias y 4 horas
		LocalDateTime fecha =LocalDateTime.now();
		System.out.println(fecha.plusMonths(1).plusDays(11).plusHours(4)); 
	}

}
