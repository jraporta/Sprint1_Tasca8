package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class App 
{
    public static void main( String[] args )
    {
    	String[] words = {"Football", "Basketball", "Tennis", "Soccer", "Baseball", "Judo", "Gymnastics", "Karate", "Ski", "Climbing", "Roller"};
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));
        
        Stream<String> s = list.stream();
        s = s.filter();
    }
}
