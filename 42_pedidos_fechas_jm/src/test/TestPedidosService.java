package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Calendar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Pedido;
import service.PedidosService;

class TestPedidosService {
	static PedidosService service = new PedidosService();
	static Calendar  calendar = Calendar.getInstance();
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		LocalDate f1= LocalDate.of(2022,1,30);
		LocalDate f2=LocalDate.of(2022,2,01);
		LocalDate f3=LocalDate.of(2022,3,31);
		LocalDate f4= LocalDate.of(2022,4,30);
		LocalDate f5=LocalDate.of(2022,5,01);
		LocalDate f6=LocalDate.of(2022,6,31);
		
		
		service.agregar(new Pedido ("Producto1", 20, f1));
		service.agregar(new Pedido ("Producto2", 1, f2));
		service.agregar(new Pedido ("Producto3", 10, f3));
		service.agregar(new Pedido("Producto4", 20, f4));
		service.agregar(new Pedido("Producto5", 21, f5));
		service.agregar(new Pedido("Producto6", 22, f6));
	}

	@Test
	void testAgregar() {
//		assertEquals(6, service.s);
		
	}

	@Test
	void testMasReciente() {
		LocalDate f1= LocalDate.of(2022,1,30);
		LocalDate f2=LocalDate.of(2022,2,01);
		LocalDate f3=LocalDate.of(2022,3,31);
		LocalDate f4= LocalDate.of(2022,4,30);
		LocalDate f5=LocalDate.of(2022,5,01);
		LocalDate f6=LocalDate.of(2022,6,31);
		
		
		service.agregar(new Pedido ("Producto1", 20, f1));
		service.agregar(new Pedido ("Producto2", 1, f2));
		service.agregar(new Pedido ("Producto3", 10, f3));
		service.agregar(new Pedido("Producto4", 20, f4));
		service.agregar(new Pedido("Producto5", 21, f5));
		service.agregar(new Pedido("Producto6", 22, f6));

		assertEquals("Producto6", service.masReciente().getNombre());
	}

	@Test
	void testPedidosEntreFechas() {
		LocalDate fMin=LocalDate.of(2022,3,5);
		LocalDate fMax=LocalDate.of(2024, 11, 30);
		assertEquals(3, service.pedidosEntreFechas(fMin, fMax));
	}


	@Test
	void testPedidoMasCercano() {
		LocalDate fecha=LocalDate.of(2022,3,5);
		Pedido pedido = new Pedido();
		
		assertEquals(pedido.getNombre()=="Producto3", service.pedidoMasCercano(fecha));
	}

	@Test
	void testPedidoProximoFecha() {
		fail("Not yet implemented");
	}


}
