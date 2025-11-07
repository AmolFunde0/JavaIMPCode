//Print Even no From 1 to 100
public class EventNo{
	public static void main(String[] args) {
		int start=1;
		int end =100;
		int sum=0;

		while(start<=end){
			if(start%2==0){
				System.out.println(start);
				//sum of even no
				sum+=start;
			}
		start++;
		}

	System.out.println("The Sum Of All EventNo is : "+sum);
	}
}