package n2exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args ) {
    	
        List<Integer> list = Arrays.asList(23, 13, 142, 1, 12, 125, 1, 456, 900, 12, 554, 319, 80);
        
  
        String s = list.stream()
        	.map(t -> t % 2 == 0 ? "e" + t : "o" + t )
        	.collect(Collectors.joining(","));
        
        System.out.println(s);
        
    }
}
