package principal;

public class ComprobarDireccionesModular {

	public static void main(String[] args) {
		String emails = "aaa@mail.com,aaa@email.com,bbb@mail.com,aaa@mail.com,ese@mail.com,"
				+ "ccc@gmail.es,cca@gmail.es,aaaa@gmail.com," 
				+ "zeta@email.com,otro@zmail.com";
		int contEs=0, contCom=0;
		String direcciones[] = emails.split(",");
//		contEs=contarDominio("es", direcciones);
//		contCom=contarDominio("com", direcciones);
		System.out.println("El dominio 'es' tiene: "+contarDominio("es", direcciones)+ " direcciones");
		System.out.println("El dominio 'com' tiene: "+contarDominio("com", direcciones)+ " direcciones");
	
	}
	
	static int contarDominio (String dominio, String [] dirs) {
		int contador=0;
		for (String d:dirs) {
			if (d.endsWith(dominio)) {
				contador++;
			}
		} return contador;
	}

}
