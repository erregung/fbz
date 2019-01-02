//koko paska rikki anyway
public class forfb {
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++);
		/*ilmeisesti for-loopin sisäiset muuttujat eivät toimi sen 
		ulkopuolella? */
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
