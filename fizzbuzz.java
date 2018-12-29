public class fizzbuzz {
	public static void main(String[] args) {
		//ruma mutta tein itse
		int i = 0;
		while (i <= 200) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
				i++;
			}
			if (i % 3 == 0) {
				System.out.println("Fizz");
				i++;
			}
			if (i % 5 == 0) {
				System.out.println("Buzz");
				i++;
			}
			System.out.println(i);
			i++;
		}
	}
}
