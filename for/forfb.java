//koko paska rikki anyway
public class forfb {
	public static void main(String[] args) {
		for(int j = 0; j < 100; j++);
		/*ilmeisesti for-loopin sisäiset muuttujat eivät toimi sen 
		ulkopuolella? */
			int i = 0;
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
