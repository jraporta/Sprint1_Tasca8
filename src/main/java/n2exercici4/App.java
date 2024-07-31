package n2exercici4;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	
        List<Object> list = Arrays.asList("12345", "Football", 23, "Basketball", 1090, "Tennis", 54, 12, 0, "Soccer", "Baseball", "Judo",
        		"Gymnastics", 12331424, "Karate", 1.012E6, -12, "Ski", "Climbing", 3.1416, 45, "Roller");
        
  
        list.stream()
        	.sorted((o1, o2) -> o1.toString().charAt(0) - o2.toString().charAt(0))
        	.forEach(System.out::println);
        
        System.out.println();
        
        list.stream()
    		.sorted((o1, o2) -> (o2.toString().contains("e") ? 1 : 0) - (o1.toString().contains("e") ? 1 : 0))
    		.forEach(System.out::println);
        
        System.out.println();
        
        list.stream()
        	.map(t -> t.toString().replace('a', '4'))
			.forEach(System.out::println);
        
        System.out.println();
        
        list.stream()
        	.map(t -> t.toString())
        	.filter(t -> isNumber(t))
			.forEach(System.out::println);
        
        
        
        
    }
    
    public static boolean isNumber(String s) {
    	try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
    }
}
