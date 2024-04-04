package pruebas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PruebaFecha {
	public static void main (String[] args) throws ParseException {
		// Fecha y hora actuales
		Date f1=new Date(Long.MAX_VALUE);
		java.sql.Date fechaSql;
//		System.out.println(f1);
		// fecha y hora concreta
		Date f2= new Date(2023,10,20);	//Deprecated
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 0, 30, 10, 20, 35);
		
		Date f3=cal.getTime();
//		System.out.println(f3);
		// Fecha a partir de una cadena de caracteres
		String fecha= "04/10/1999 23:45";
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date f4=format.parse(fecha);
		System.out.println(f4);
		
	}

}
