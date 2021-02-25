package coreJavaLoops;

public class Assignment4 {

	public static void main(String[] args) {
		runForLoop();
		runWhileLoop();
		runDoWhileLoop();
		testContinue();
		testBreak();
		printWeeksAndDays();
		printPalindrome();
		printFibonacci();
		printInnerLoop();
	}
	
	/**
	 * Write a program that uses a for-loop to loop through the numbers 
	 * 1-10 and prints out each number.
	 */
	private static void runForLoop() {
		System.out.println("runForLoop: ");
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	/**
	 * Write a program that uses a while loop to loop through the numbers 
	 * 0-100 in increments of 10 and prints out each number.
	 */
	private static void runWhileLoop() {
		System.out.println("runWhileLoop: ");
		int i = 0;
		while(i < 100) {
			System.out.println(i);
			i += 10;
		}
	}
	
	/**
	 * Write a program that uses a do-while-loop to loop through the numbers 
	 * 1-10 and prints out each number.
	 */
	private static void runDoWhileLoop() {
		System.out.println("runDoWhileLoop: ");
		int i = 0;
		do {
			System.out.println(i + 1);
			i++;
		} while(i < 10);
	}
	
	/**
	 * Write a program that uses a for-loop to loop through the numbers 1-100. 
	 * Print out each number if is a multiple of 5, but do not print out any 
	 * numbers between 25 and 75. Use the “continue” statement to accomplish this.
	 */
	private static void testContinue() {
		System.out.println("testContinue: ");
		for(int i = 1; i < 101; i++) {
			if(i >= 25 && i <= 75) {
				continue;
			}
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * Write a program that uses a for-loop to loop through the numbers 1-100. 
	 * Print out each number if is a multiple of 5, but do not print out any 
	 * numbers greater than 50. Use the “break” keyword to accomplish this.
	 */
	private static void testBreak() {
		System.out.println("testBreak: ");
		for(int i = 1; i < 101; i++) {
			if(i > 50) {
				break;
			}
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * Write a program that uses nested for-loops to output the following:
	 *	Week 1:
	 *	Day 1
	 *	Day 2
	 *	Day 3
	 *	Day 4	
	 *	Day 5
	 *	Week 2:
	 *	Day 1	
	 *	Day 2	
	 *	Day 3	
	 *	Day 4	
	 *	Day 5
	 */
	private static void printWeeksAndDays() {
		System.out.println("printWeeksAndDays");
		for(int i = 0; i < 2; i++) {
			System.out.println("Week " + (i + 1) + ":");
			for(int j = 0; j < 5; j++) {
				System.out.println("Day " + (j + 1));
			}
		}
	}
	
	/**
	 * Write a program that returns all the available palindromes within 
	 * 10 and 200. The following output will be produced:
	 * 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 
	 * 161, 171, 181, 191,
	 */
	private static void printPalindrome() {
		System.out.println("printPalindrome: ");
		for(int i = 11; i < 100; i += 11) {
			System.out.println(i);
		}
		for(int j = 101; j < 200; j += 10) {
			System.out.println(j);
		}
	}
	
	/**
	 * Write a program that prints the Fibonacci Sequence from 0 to 50. 
	 * The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
	 */
	private static void printFibonacci() {
		System.out.println("printFibonacci: ");
		int next = 1;
		int prev = 0;
		while(prev < 50) {
			System.out.println(prev);
			int temp = next + prev;
			prev = next;
			next = temp;
		}
	}
	
	/**
	 * Write a program that nests a for-loop inside another. Print out the inner 
	 * and outer variable (e.g., i or j) in the inner loop 
	 * (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
	 */
	private static void printInnerLoop() {
		System.out.println("printInnerLoop: ");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}
}
