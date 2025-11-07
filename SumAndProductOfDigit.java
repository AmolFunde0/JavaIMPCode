//code to find sum and product of digits of a number and check if they are equal
public class SumAndProductOfDigit{
	public static void main(String[] args) {
		int number = 123;
		int digSum=0;
		int digProduct=1;

		while(number>0){
			int dig = number%10;
			digSum=digSum+dig;
			digProduct=digProduct*dig;
			number=number/10;
		}
		System.out.println("The Sum : "+digSum);
		System.out.println("The Product : "+digProduct);

		if(digSum==digProduct){
			System.out.println("The Sum And Product Is Equal ");
		}else{
			System.out.println("The Sum And Product Is Not Equal ");
		}
	}
}