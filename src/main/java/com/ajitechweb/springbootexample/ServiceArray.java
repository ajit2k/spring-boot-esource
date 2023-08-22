package com.ajitechweb.springbootexample;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.*;

@Service
public class ServiceArray {



    static HashSet uniqueSet= new HashSet();
    public static HashSet threeArrayGenerator()
    {
         System.out.println("The Array Generator");
         HashSet hs = new HashSet();
         List li = new ArrayList();

           List<Integer> array1  = randomaArrayGnerator(15,50);
           System.out.println("ArrayOne :"+array1);

           List<Integer> array2  = randomaArrayGnerator(15,50);
           System.out.println("ArrayTwo :"+array2);

           List<Integer> array3  = randomaArrayGnerator(15,50);
           System.out.println("ArrayThree :"+array3);

           hs.add(array1);
           hs.add(array2);
           hs.add(array3);

         //  hs.forEach( n -> { uniqueSet.add(n); });

           return uniqueSet;
    }

    public static List<Integer> randomaArrayGnerator(int size, int range)
    {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(range );
            array.add(randomNumber);
            uniqueSet.add(randomNumber);
        }
        return array;

    }

    public static HashSet arrayOfAvailableNumbers(HashSet uniqueSet)
    {
        HashSet allNumbers = new HashSet();
        HashSet availableNumbers = new HashSet();
        for(int i=1;i<=50;i++)
        {
            allNumbers.add(i);
        }

      //  System.out.println("list of All possible Numbers "+ allNumbers);

        availableNumbers.addAll(allNumbers);
        availableNumbers.removeAll(uniqueSet);
        return availableNumbers;
    }

    public static int  largestPrimeNumber(HashSet availablePrimeNumber)
    {
        final int[] highestPrimeNumber = {0};

        availablePrimeNumber.forEach( i -> {

            int in = Integer.parseInt(i+"");
            boolean isPrime = checkPrime(in);
            if(isPrime) { if( in> highestPrimeNumber[0])
                highestPrimeNumber[0] = in;
            } }
             );

        return highestPrimeNumber[0];
    }

    public static boolean checkPrime(int num) {
        boolean flag=true;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = false;
                break;
            }

        }
     return flag;
    }


}
