//code to count number of digits in a number
public class DigitCount{
	public static void main(String args[]){
		int num = 153425;
		int digCount=0;
		int oddCount=0;
		int evenCount=0;
		int evenSum=0;
		int oddSum=0;

		while(num>0){
			int digit= num % 10;
			if(digit%2==0){
				//even digit count
				evenCount++;
				//sum of even digits
				evenSum=evenSum+digit;
			}else{
				//odd digit count
				oddCount++;
				//sum of odd digits
				oddSum=oddSum+digit;
			}
			
			digCount++;
			num=num/10;

		}
	System.out.println("The Count is : "+digCount);
	System.out.println("The oddCount is : "+oddCount);
	System.out.println("The evenCount is : "+evenCount);
	System.out.println("The evenSum is : "+evenSum);
	System.out.println("The oddSum is : "+oddSum);

	}

}