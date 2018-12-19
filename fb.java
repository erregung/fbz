public class FizzBuzz {
	public static void main(String[] args) {
		//harjoittelua, ei suurimmilta osin omaa koodia
		for (int i = 1; i <= 100; i++) {
			boolean ForB = false;
			if (i % 3 == 0) {
				System.out.print("Fizz");
				ForB = true;
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
				ForB = true;
			}
			if (ForB) {
				System.out.println();
			} else {
				System.out.println(String.valueOf(1));
			}
		}
	}
}
