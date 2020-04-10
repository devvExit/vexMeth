//Challenge: Do not change any of the lines of code. Only change the order of the lines.

/*-----------------------ORIGINAL:

import java.util.Scanner;

public class CardioZone {
	public static void main( String[] args ) {
		zoneMax = Math.round(maxHeartRate * 0.80);
		maxHeartRate = 220 - age;
		System.out.println( "The \"cardio zone\" is from " + zoneMin + " to " + zoneMax + " bpm." );
		age = keyboard.nextInt();
		double zoneMin, zoneMax;
		System.out.println( "The maximum heart rate for a " + age + "-year-old is " + maxHeartRate );
		zoneMin = Math.round(maxHeartRate * 0.60);
		System.out.print( "Age: " );
		Scanner keyboard = new Scanner(System.in);
		int age, maxHeartRate;
	}
}
-----------------------*/

import java.util.Scanner;

public class cardioZone {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age, maxHeartRate;
		double zoneMin, zoneMax;
		
		System.out.print( "Age: " );
		age = keyboard.nextInt();
		maxHeartRate = 220 - age;
		zoneMin = Math.round(maxHeartRate * 0.60);
		zoneMax = Math.round(maxHeartRate * 0.80);

		System.out.println( "The maximum heart rate for a " + age + "-year-old is " + maxHeartRate );
		System.out.println("The \"cardio zone\" is from " + zoneMin + " to " + zoneMax + " bpm.");
		keyboard.close();
	}
}
