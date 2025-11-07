public class CheckLeapYear{
	public static void main(String args[]){
		int year = 2048;

		if((year % 400 ==0 ) || (year % 4 ==0 && year % 100 !=0)){
			System.out.println("The Year : "+year+" is Leap Year");
		}else{
			System.out.println("The Year : "+year+" is Not Leap Year");
		}
	}
}