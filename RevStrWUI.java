import java.util.Scanner;

public class RevStrWUI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();

		char[] chars = input.toCharArray();
		int left = 0;
		int right = chars.length-1;

		while(left<right){
			char temp = chars[left];
			chars[left]=chars[right];
			chars[right]=temp;
			left++;
			right--;
		}

		String reversed = new String(chars);

		System.out.println("The reversed String is : "+reversed);
	}
}
