package principal;

public class ComprobarDireccionesArrays {

	public static void main(String[] args) {
		String emails = "aaa@mail.com,aaa@email.com,bbb@mail.com,aaa@mail.com,ese@mail.com,"
				+ "ccc@gmail.com,cca@gmail.com,aaaa@gmail.com," 
				+ "zeta@email.com,otro@zmail.com";
		
		String mails[] = emails.split(",");
		String[] mc = new String[mails.length];
		for (int i = 0; i < mails.length; i++) {
			mc[i] = mails[i].substring(mails[i].indexOf('@') + 1);
		}
		for (int i = 0; i < mc.length; i++) {
			int contador = 0;
			for (int j = 0; j < mc.length; j++) {
				if (mc[i].equals(mc[j])) {
					contador++;
				}
			}
			System.out.println("El dominio "+mc[i] + " tiene " + contador+ " emails");
		}
	}
}
