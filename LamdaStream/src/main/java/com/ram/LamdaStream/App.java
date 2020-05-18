package com.ram.LamdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
      List<String> names = Arrays.asList("Sam","Jam","Will","Bill" );
        
      for(String name: names) {
    	  System.out.println(name);
      };
      
      names
           .stream()
           .filter( p ->  p.equals("Sam"))
           .forEach(p ->  System.out.println("found Sam"));
      
       List<String> stings =   Stream.of("One","Two","three")
                  .filter(s -> !s.equals("One"))
                  .peek(p -> System.out.println(p))
                  .collect(Collectors.toList());
       
       IntStream.of(1,44,53,20,5,4,25)
                .skip(2)
                .filter(i ->  i > 5)
                .forEach(i -> System.out.println(i));
       


            
       
    }
}
