package n1exercici8;

public class App {

	public static void main(String[] args) {
		
		MyInterface reverseString = (s -> new StringBuilder(s).reverse().toString());
		
		System.out.println(reverseString.reverse("Hello world!"));

	}

}