package principal;

public class Division {
	
	public static void main (String [] args) {
	int x=8;
	int y=15;
	if (x>y) {
		System.out.println((double)x/y);
	}
	else {	
		System.out.println((double)y/x);
	}
	System.out.println(x>y?(double)x/y:(double)y/x);
	}
}
		

