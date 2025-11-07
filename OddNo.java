//Odd No From 1 to 100
public class OddNo{
	public static void main(String args[]){
		int start = 1;
		int end = 100 ;
		int sum=0;

		while(start<end){
			if(start % 2 !=0){
				System.out.println(start);
				//sum of odd no
				sum+=start;
			}
		start++;
		}

	}
}