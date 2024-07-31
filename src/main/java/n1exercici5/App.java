package n1exercici5;

public class App {

	public static void main(String[] args) {
		
		MyInterface simpleMaths = new MyInterface() {
			
			@Override
			public double getPiValue() {
				
				return 3.1415;
			}
		}; 
		
		System.out.println(simpleMaths.getPiValue());
		

	}

}
