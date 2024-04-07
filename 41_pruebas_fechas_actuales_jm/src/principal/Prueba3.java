package principal;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Prueba3 {

	public static void main(String[] args) {
		LocalDate f1=LocalDate.of(2023,11,4);
		LocalDate f2=LocalDate.of(2024,3,7);
//		System.out.println(Period.between(f1, f2));
		Period p1 = Period.between(f1, f2);
//		System.out.println("Meses "+p1.getMonths()+" Dias"+p1.getDays());
		
		long dias1=p1.get(ChronoUnit.DAYS);
//		System.out.println("Total dias primer periodo"+ p1);
		LocalDate f3=LocalDate.of(2023, 4,4);
		LocalDate f4=LocalDate.of(2024, 8,7);

		Period p2 = Period.between(f1, f2);
//		long dias2=p2.get(ChronoUnit.DAYS.between(f3, f4));
		long dias2=p2.get(ChronoUnit.DAYS);
		long dias3=ChronoUnit.DAYS.between(f3, f4) ;
		System.out.println(dias3);
		
//		System.out.println("Total dias3 SEGUNDO periodo"+ dias3);
//		System.out.println(p2);
		
	}
	
	
}
