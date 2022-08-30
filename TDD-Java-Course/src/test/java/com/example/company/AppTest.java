package com.example.company;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AppTest
{
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionWhenGetANegativeNumber(){
        int inputNumber =-20;
        App.fizzBuzz(inputNumber);
    }

    @Test()
    public void shouldGetAFizzBuzzWhenNumber15(){
        int inputNumber =20;
        List<String> result = App.fizzBuzz(inputNumber);
        Assert.assertEquals("FizzBuzz",result.get(14));
    }

    @Test()
    public void shouldGetA4WhenNumber4(){
        int inputNumber =20;
        List<String> result = App.fizzBuzz(inputNumber);
        Assert.assertEquals("4",result.get(3));
    }

    @Test()
    public void shouldGetABuzzWhenNumber5(){
        int inputNumber =20;
        List<String> result = App.fizzBuzz(inputNumber);
        Assert.assertEquals("Buzz",result.get(4));
    }

    @Test()
    public void shouldGetAFizzWhenNumber3(){
        int inputNumber =20;
        List<String> result = App.fizzBuzz(inputNumber);
        Assert.assertEquals("Fizz",result.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenNumberMoreThan100(){
        int inputNumber =101;
        App.fizzBuzz(inputNumber);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionZero(){
        int inputNumber = 0;
        App.fizzBuzz(inputNumber);
    }
}