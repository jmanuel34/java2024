package principal;

public class ComprobarPrimo {

	public static void main(String[] args) {
		int num=17;
		boolean primo = true;
		for (int i=2; i<num/2; i++) {
			if (num%i == 0) {
				primo = false;
				break;
			}
		}
		if (primo) System.out.println("El numero ES primo");
		else System.out.println("El número NO ES primo");
	// 
	}

}
