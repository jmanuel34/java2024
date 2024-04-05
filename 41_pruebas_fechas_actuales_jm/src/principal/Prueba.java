package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prueba {

	public static void main(String[] args) {
		LocalDate f1=LocalDate.now();
		LocalDate f2= LocalDate.of(2021,11,3);
//		System.out.println(f1);
//		System.out.println(f2);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate f3= LocalDate.of(2023,12,11);	
//		f3.parse(f3, format);
//		LocalDate date =LocalDate.parse((f3, format);
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha="20/09/2019";
		LocalDate date=LocalDate.parse(fecha, formato);
		
		//
		LocalDate f4=LocalDate.of(2024, 2, 28);
//		System.out.println(f4.plusMonths(2));
		System.out.println(f4.plusDays(10));
	
	}

}
