package day3examples;

public class FizzBuzz {
	// if divisible by 3 - Fizz
	// if divisible by 5 - Buzz
	// if divisible by 7 -Bang

	public static void main(String[] args) {
		for (int i = 1; i <= 110; i++) {
			if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)) {
				System.out.println("Fizz-Buzz-Bang");
			} else if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Fizz-Buzz");
			} else if ((i % 3 == 0) && (i % 7 == 0)) {
				System.out.println("Fizz-Bang");
			} else if ((i % 5 == 0) && (i % 7 == 0)) {
				System.out.println("Buzz-Bang");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 7 == 0) {
				System.out.println("Bang");
			} else {
				System.out.println(i);
			}
		}
	}

}
