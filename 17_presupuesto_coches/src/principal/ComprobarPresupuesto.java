package principal;
/*
 * Dada una serie de precios de coches, se le pedira al cliente cual es su presupuesto
 * y el programa indicará a cuántos coches puede optar
 */

import java.util.Scanner;

public class ComprobarPresupuesto {

	public static void main(String[] args) {
		int [] b= new int[2];
		var contador=0;
		double presupuesto;
//		double [] precios= {19_500.0, 23_450, 17_300, 33_500, 25_340, 41_800};
		var precios= new double[] {19_500.0, 23_450, 17_300, 33_500, 25_340, 41_800};
		var sc = new Scanner(System.in);
		System.out.println("Dame tu presupuesto: ");
		presupuesto = sc.nextDouble();
		sc.close();
		
		for (var precio:precios) {
			if (presupuesto>=precio) {
				contador++;
			}
		}
		System.out.println("Puedes optar a "+contador+ " coches");
		
	}

}

/*
 * int [] n={3,7,1,0};
int r=4;
System.out.println(switch(r){
	case 1->n[0];
	case 2->n[1];
	case 0->n[3];
	case 4->n[2];
});

a.- 1
b.- 0
c.- No muestra nada
*d.- Error de compilación  => falta bloque default
e.- Excepción ArrayIndexOutOfBoundsException 
*/
/*
 * public static void main(String[] args){
	var r=new int[5]; //linea1
	System.out.println(r[0]);  //linea2

}

*a.- 0
b.- No imprime nada
c.- error de compilación en linea1
d.- error de compilación en linea2
e.- Excepción ArrayIndexOutOfBoundsException 
Al crear el array de enteros se crean las casillas inicializados a 0,
por lo que al imprimir
 * 
*/
/*
 * public static void main(String[] args){
	int[] r; //linea1
	System.out.println(r[0]);  //linea2

}

a.- 0
b.- No imprime nada
c.- error de compilación en linea1
*d.- error de compilación en linea2
e.- Excepción NullPointerException
 */
/*
static int[] r; //linea1
public static void main(String[] args){	
	System.out.println(r[0]);  //linea2
}

a.- 0
b.- No imprime nada
c.- error de compilación en linea1
d.- error de compilación en linea2
*e.- Excepción NullPointerException 
*/

/*
 * int a=10;
int [] b=new int[2];
int [][] c=new int[4][];


b[0]=a;  //ok
c[0][1]=a; // Incorrecto, segunda dimensión sin tamaño
c[0]=b[1]; // Incorrecto, 
c[1]=b;  //  OK
b[3]=20; // Incorrecto, IndexOutOfBoundsException
c[2]=new int[]{2,3,1};  // Ok 
 */