public class LeapYear{
	public static void main(String[] args) {
		int start = 2001;
		int end = 2050;
		int count=0;

		while(start<end){

			if((start % 400 == 0 ) || (start % 4 == 0 && start % 100 != 0 )){
				System.out.println(start);
				count++;
			}
			start++;

		}
		System.out.println("The Count is : "+count);

	}
}