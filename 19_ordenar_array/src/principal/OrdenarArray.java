package principal;

import java.util.Arrays;

public class OrdenarArray {

	public static void main(String[] args) {
	int [] edades= {19,26,14,55,38,27,30};
	int aux;
	/*
	for (int i=0; i<edades.length-1; i++) {
		for (int k=i+1; k<edades.length; k++) {
			if (edades[i]>edades[k]) {
				aux= edades[k];
				edades[k]=edades[i];
				edades[i]=aux;
			}
		}
	}
	*/
	Arrays.sort(edades);
	for (int edad:edades) {
		System.out.println("Las edades ordenadas son: "+edad);
	}

	}

}
