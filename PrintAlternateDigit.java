//Print alternate digit of a number
public class PrintAlternateDigit{
	public static void main(String[] args) {
		int number =12345;

		while(number!=0){
			int dig = number % 10;
			System.out.print("  "+dig);
			number=number/100;
		}
	}
}