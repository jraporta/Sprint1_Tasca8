package n1exercici4;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
        		"September", "October", "November", "December");
        
  
        months.stream().forEach(System.out::println);
    }
}
