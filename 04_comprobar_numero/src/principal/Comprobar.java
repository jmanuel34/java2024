package principal;

public class Comprobar {

	public static void main(String[] args) {
		int num=7;
		int salida;
		// si el número es par nos muestra la mitad
		// si es impar muestra la mitad del anterior
//		?num%2?num/2:(num-1)/2;
		System.out.println(num%2==0?num/2:(num-1)/2);
		if (num%2==0) System.out.println(num/2);
		else System.out.println((num-1)/2);
	}

}
/*

Antonio Martín dice:
int a=10;
int b=a++;  								// b=10; a=11
int c=++b; 	 								// b= 11; c=11
System.out.println(a<b?b>c?a--:c++:--b); 	// 12 (11<10?

//if(a<b){   
	if(b>c){
		a--;
	}else{
		c++;
	}
}else{
	--b;
} 
*/