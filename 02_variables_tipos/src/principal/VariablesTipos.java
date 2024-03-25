package principal;

public class VariablesTipos {
	static int r;
	public static void main(String[] args) {
	
	int s,v,a=10;
	System.out.println("La variable 'a' vale: "+a);
	s=7;
	System.out.println(s);
	System.out.println(r);
	System.out.println();
	// casos especiales
	int car = 345_223_345;
	double df = 124.55_7;
	float n= 4.6f; // los literales decimales son double
	long yq= 2222222222l; // los literales enteros son int (salvo que le pongas 'l' final
	int bin = 0b101;
	System.out.println(bin);
	
	}

}
