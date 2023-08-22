package com.ajitechweb.springbootexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ServiceArrayTest {

    @Autowired
    private ServiceArray numberService;

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
