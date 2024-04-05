package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
		calendar.set(2023,11,30);
		Date f1=calendar.getTime();
		calendar.set(2022,04,30);
		Date f2=calendar.getTime();
		calendar.set(2021,11,31);
		Date f3=calendar.getTime();
		
		service.agregar(new Pedido ("CocaCola", 20, f1));
		service.agregar(new Pedido ("whiski", 1, f2));
		service.agregar(new Pedido ("Patatas", 10, f3));
		
		assertEquals("CocaCola", service.masReciente().getNombre());
	}

	@Test
	void testTestMasReciente() {
		fail("Not yet implemented");
	}

	@Test
	void testTestPedidosEntreFechas() {
		calendar.set(2023,11,31);
		Date f1=calendar.getTime();
		calendar.set(2022,01,01);
		Date f2=calendar.getTime();
		assertEquals(2, service.pedidosEntreFechas(f2, f1));
	}

}
