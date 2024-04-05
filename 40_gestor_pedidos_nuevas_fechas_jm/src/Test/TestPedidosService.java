package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import modelo.Pedido;
import service.PedidosService;

class TestPedidosService {
	 static PedidosService service = new PedidosService();
	static Calendar  calendar = Calendar.getInstance();

	@Test
	void testTestAgregar() {
		LocalDate f1= LocalDate.of(2023,11,30);
		LocalDate f2=LocalDate.of(2024,01,01);
		LocalDate f3=LocalDate.of(2022,11,31);
		
		service.agregar(new Pedido ("CocaCola", 20, f1));
		service.agregar(new Pedido ("whiski", 1, f2));
		service.agregar(new Pedido ("Patatas", 10, f3));
		
	}

	@Test
	void testTestMasReciente() {
		LocalDate f1= LocalDate.of(2023,11,30);
		LocalDate f2=LocalDate.of(2024,01,01);
		LocalDate f3=LocalDate.of(2022,11,31);
		
		service.agregar(new Pedido ("CocaCola", 20, f1));
		service.agregar(new Pedido ("whiski", 1, f2));
		service.agregar(new Pedido ("Patatas", 10, f3));

		assertEquals("whiski", service.masReciente().getNombre());
	}

	@Test
	void testTestPedidosEntreFechas() {
		LocalDate fMin=LocalDate.of(2023,10,30);
		LocalDate fMax=LocalDate.of(2024, 11, 30);
		assertEquals(1, service.pedidosEntreFechas(fMin, fMax));
	}

}
