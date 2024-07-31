package n2exercici1;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args ) {
    	
        List<String> list = Arrays.asList("Ana", "Elsa", "Ava", "Laura", "Eda", "Romina",
        		"Ada", "Eva", "Aran", "Gloria", "Alba");
        
  
        list = list.stream().filter(s -> s.charAt(0) == 'A').
        		filter(s -> s.length() == 3).toList();
        
        System.out.println(list);
        
    }
}
