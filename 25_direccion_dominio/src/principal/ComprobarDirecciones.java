package principal;

// Diga cuantas direcciones hay de cada dominio

public class ComprobarDirecciones {

	public static void main(String[] args) {
		String emails = "aaa@mail.com,aaa@email.com,bbb@mail.com,aaa@mail.com,ese@mail.com,"
				+ "ccc@gmail.com,cca@gmail.com,aaaa@gmail.com," 
				+ "zeta@email.com,otro@zmail.com";
		String mail[] = emails.split(",");						// Convertimos la cadena a un array de cadenas
		
		
		for (int i = 0; i < mail.length; i++) {					// Recorremos el array
			if (mail[i].equals("_"))							// Excepcion de encontrar cadena vacia
				continue;
			int contador = 1;									// Incializamos contador a 1
			
			for (int j = i+1; j < mail.length; j++) {			// Recorrido de array para comparar
				// Comparamos los substring de los dos elementos a partir del caracter @
				if (mail[j].equals("_"))							// Excepcion de encontrar cadena vacia
					continue;
				if (mail[i].substring(mail[i].indexOf('@')).equals(
						mail[j].substring(mail[j].indexOf('@')))) {
					contador++;
					mail[j] = "_";								// Ponemos la direccion a "" para que no vuelva a contar
				}
			}
			System.out.println(
					"La direccion " + mail[i].substring(mail[i].indexOf('@')) + " tiene " + contador + " emails");
		}

	}
}
