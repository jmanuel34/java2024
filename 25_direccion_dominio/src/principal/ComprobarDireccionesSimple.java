package principal;

public class ComprobarDireccionesSimple {

	public static void main(String[] args) {
		String emails = "aaa@mail.com,aaa@email.com,bbb@mail.com,aaa@mail.com,ese@mail.com,"
				+ "ccc@gmail.com,cca@gmail.com,aaaa@gmail.com," 
				+ "zeta@email.com,otro@zmail.com";
		int contEs=0, contCom=0;
		String direcciones[] = emails.split(",");
		for (String dir:direcciones) {
			switch(dir.substring(dir.indexOf(".")+1, dir.length())) {
			case "es":
				contEs++;
				break;
			case "com":
				contCom++;
		}
		

		}
		System.out.println("Direcciones es: " +contEs);
		System.out.println("Direcciones es: " +contEs);

}
}
