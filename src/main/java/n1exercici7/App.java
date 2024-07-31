package n1exercici7;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	
        List<Object> list = Arrays.asList("Football", 23, "Basketball", 1090, "Tennis", 54, 12, 0, "Soccer", "Baseball", "Judo",
        		"Gymnastics", 12331424, "Karate", "Ski", "Climbing", 45, "Roller");
        
  
        list.stream()
        	.filter(o -> o.getClass().equals(String.class))
        	.map(o -> (String) o)
        	.sorted((s1, s2) -> s2.length() - s1.length())
        	.forEach(System.out::println);
        
        
        
    }
}
