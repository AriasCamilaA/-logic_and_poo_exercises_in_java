
public class ISBN_test {
	public static void main(String[] args) {
		// EJ 10:    2123456802
		// EJ 13: 9782123456803
		validar_ISBN validar = new validar_ISBN();
		System.out.println("||Bienvenido al validador de ISBN||");
		System.out.println("Cuantos digitos tiene su ISBN");
		validar.digitos = validar.Leer.nextInt();
		validar.validar_tipos();
	}

}
