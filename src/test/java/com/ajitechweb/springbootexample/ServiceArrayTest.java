package com.ajitechweb.springbootexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.ajitechweb.springbootexample.ServiceArray.randomaArrayGnerator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ServiceArrayTest {

    @Autowired
    private ServiceArray numberService;

    @Test
    public  void testThreeArrayGenerator(){

        List<Integer> array1  = randomaArrayGnerator(15,50);

        List<Integer> array2  = randomaArrayGnerator(15,50);

        List<Integer> array3  = randomaArrayGnerator(15,50);

        assertEquals(array1.size(),15);
        assertEquals(array2.size(),15);
        assertEquals(array3.size(),15);


    }

    @Test
    public void testRandomaArrayGnerator(){

        List randomNumberList = numberService.randomaArrayGnerator(15,50);
        assertTrue(randomNumberList.size()!=0);
        assertTrue(randomNumberList!=null);
    }

    @Test
    public void testArrayOfAvailableNumbers(){
        HashSet uniqueSet= new HashSet();
        uniqueSet.add(2);
        uniqueSet.add(10);
        uniqueSet.add(15);
        uniqueSet.add(17);

        HashSet availableNummbers = numberService.arrayOfAvailableNumbers(uniqueSet);
        assertTrue(availableNummbers.size()!=0);
        assertTrue(availableNummbers!=null);
    }

    @Test
    public void testCheckPrime() {
        assertTrue(numberService.checkPrime(2));
        assertTrue(numberService.checkPrime(3));
        assertTrue(numberService.checkPrime(5));
        assertTrue(numberService.checkPrime(17));
    }

    @Test
    public void testFindLargestPrime() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(11);
        numbers.add(15);
        numbers.add(20);

        int largestPrime = numberService.largestPrimeNumber(numbers);
        assertEquals(11, largestPrime);
    }
}
