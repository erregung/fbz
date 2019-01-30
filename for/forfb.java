public class forfb {
	public static void main(String[] args) {
		int i = 0;
		for(i = 0; i < 100; i++);
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
				
			}
			if (i % 3 == 0) {
				System.out.println("Fizz");
				
			}
			if (i % 5 == 0) {
				System.out.println("Buzz");
				
			}
			System.out.println(i);
			
	}
}	
