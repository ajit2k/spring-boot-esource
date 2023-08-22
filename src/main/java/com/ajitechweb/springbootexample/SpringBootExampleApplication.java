package com.ajitechweb.springbootexample;
import com.bettercloud.vault.VaultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashSet;

@SpringBootApplication
public class SpringBootExampleApplication {

	@Autowired
	static
	ServiceArray serviceArray;

	public static void main(String[] args) throws VaultException {
		SpringApplication.run(SpringBootExampleApplication.class, args);
		HashSet usedRandomNumber =serviceArray.threeArrayGenerator();

		System.out.println("Numbers used in all three arrays :"+usedRandomNumber);

		HashSet availableNumbers = serviceArray.arrayOfAvailableNumbers(usedRandomNumber);

		System.out.println("List of Available Numbers :"+availableNumbers);

		int highestPrimeNumber = serviceArray.largestPrimeNumber(availableNumbers);

		System.out.println("Highest prime number in available Numbers --> "+highestPrimeNumber);
	}
}