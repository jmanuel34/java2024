package principal;
// Mostrar cuantas direcciones hay de cada dominio
public class ComprobarDireccionesCompleto {

	public static void main(String[] args) {
		String emails = "aaa@mail.com,aaa@email.ces,bbb@mail.com,aaa@mail.com,ese@mail.com,"
				+ "ccc@gmail.com,cca@gmail.com,aaaa@gmail.com," 
				+ "zeta@email.org,otro@zmail.info";
		StringBuilder cadenaDominiosSb= new StringBuilder(); 
		String dirs[] = emails.split(",");
		
		String[] dom = dominios(dirs);
		
		for(String n:dom) {
			System.out.println("Dominio: "+n);
		}
	}

	static String[] dominios (String[] dirs) {
		String cadenaDominios=dirs[0].substring(dirs[0].indexOf(".")+1, dirs[0].length());
		for (int i=1; i<dirs.length; i++) {
			String dominio =dirs[i].substring(dirs[i].indexOf(".")+1, dirs[i].length());
			if (!cadenaDominios.contains(dominio)) {
				cadenaDominios= cadenaDominios+","+dominio;
			}
		}
		cadenaDominios=cadenaDominios.substring(0,cadenaDominios.length()-1);
		return cadenaDominios.split(","); 
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

