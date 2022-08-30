package com.example.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(fizzBuzz(20));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> serie = new ArrayList<>();
        if(n<=0 || n>100){
            throw new IllegalArgumentException("No puede ser menor que 0 ni mayor a 100"); }

        for (int m=1; m<=n; m++)
        {
            if (m%3 == 0 && m%5 ==0)
                serie.add("FizzBuzz");
            else if (m%3 == 0)
                serie.add("Fizz");
            else if (m%5 == 0)
                serie.add("Buzz");
            else
                serie.add(m+"");
        }
        return serie;
    }
}
