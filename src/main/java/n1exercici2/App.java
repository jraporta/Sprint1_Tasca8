package n1exercici2;

import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	
        List<String> list = Arrays.asList("Football", "Basketball", "Tennis", "Soccer", "Baseball", "Judo",
        		"Gymnastics", "Karate", "Ski", "Climbing", "Roller");
        
  
        list = list.stream().filter(s -> s.contains("o")).
        		filter(s -> s.length() > 5).toList();
        
        System.out.println(list);
        
    }
}
