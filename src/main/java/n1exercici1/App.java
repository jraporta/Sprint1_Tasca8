package n1exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App 
{
    public static void main( String[] args )
    {
    	
        List<String> list = Arrays.asList("Football", "Basketball", "Tennis", "Soccer", "Baseball", "Judo",
        		"Gymnastics", "Karate", "Ski", "Climbing", "Roller");
        
        Stream<String> s = list.stream();
        list = s.filter(str -> str.toLowerCase().contains("o")).toList();
        System.out.println(list);
    }
}
