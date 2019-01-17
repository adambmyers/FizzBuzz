package fizzbuzz;

public class FizzBuzz {

	public static String getAnswerFor(int number) {
		if (isDivisableByThree(number) && isDivisableByFive(number)) {
			return "FizzBuzz";
		}else if (isDivisableByThree(number)) {
			return "Fizz";
		} else if (isDivisableByFive(number)) {
			return "Buzz";
		} else {
			return "" + number;
		}
	}

	private static boolean isDivisableByFive(int number) {
		return number % 5 ==0;
	}

	private static boolean isDivisableByThree(int number) {
		return number % 3 == 0;
	}
}
