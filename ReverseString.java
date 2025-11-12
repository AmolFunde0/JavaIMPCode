public class ReverseString {
    public static void main(String[] args) {
        //Reverse a string without using inbuilt function
        String str="Hello India";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed String: "+rev);
    }
}
