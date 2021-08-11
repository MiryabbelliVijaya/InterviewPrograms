package DailyInterviewPrograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenateRandomNumber {

	public static void main(String[] args) {
		
		// This is using Random class
		System.out.println("=========This is using Random class========");
		Random random = new Random();
		for(int i=0; i<=5; i++)
		{
			System.out.println("random int : " + random.nextInt());
			System.out.println("random int : " + random.nextLong());
			System.out.println("random int : " + random.nextDouble());
			System.out.println("random int : " + random.nextDouble());
			System.out.println("random int : " + random.nextBoolean());
		}
		// This is using Math : only double
		System.out.println("============This is using Math=============");
		for(int i=0; i<=5; i++)
		{
			System.out.println("random int : " + Math.random());
		}
		System.out.println("============This is using ThreadLocalRandom=============");
		for(int i=0; i<=5; i++) {
			System.out.println("random int : " + random.nextInt(20)); //Range
			System.out.println((double)(ThreadLocalRandom.current().nextFloat()));
			System.out.println(ThreadLocalRandom.current().nextBoolean());
			System.out.println(ThreadLocalRandom.current().nextInt(2,10));
		}
		
	}

}
