package n2exercici3;

public class App {

	public static void main(String[] args) {

		MyInterface suma = (f1, f2) -> f1 + f2;
		MyInterface resta = (f1, f2) -> f1 - f2;
		MyInterface multiplicacio = (f1, f2) -> f1 * f2;
		MyInterface divisio = (f1, f2) -> f1 / f2;

		System.out.println(suma.operacio(3.5f, 2.2f));
		System.out.println(resta.operacio(3.5f, 2.2f));
		System.out.println(multiplicacio.operacio(3.5f, 2.2f));
		System.out.println(divisio.operacio(3.5f, 2.2f));
		
	}

}
