package principal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Prueba4 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDateTime.now().toInstant(ZoneOffset.UTC);
		Instant instant = date.atStartOfDay(ZoneId.systemDefault()).toInstant();
		System.out.println(instant);
	}

}
