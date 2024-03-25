package principal;

public class ComprobarNota {

	public static void main(String[] args) {
		int nota= 9;
		// a partir de la nota indicará si es un suspenso
		// entre 1 y 4
		// aprobado 5 o 6
		// Nota ble 7 ,8
		// sobresaliente 9, 10
		
		switch (nota) {
		case 0,1,2,3,4:
			System.out.println("Suspenso");
			break;
		case 5,6:
			System.out.println("Aprobado");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
		} /*
		// desde Java 14
		*/
		String resultado;
		resultado=switch(nota) {
		case 1,2,3,4->{int a=1; yield "Suspenso";}
		case 5,6-> "Aprobado";
		case 7,8-> "Notable";
		case 9,10->"Sobresaliente";
		default->"Nota no valida!";
		};
		System.out.println(resultado);
		
	}

}
