import java.util.Arrays;
public class SortArray{
    public static void main(String args[]){
        int arr[]={5,7,3,2,8,10,2,3,4};
       for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
       }
       System.out.println(" ");
        Arrays.sort(arr);
        System.out.println("Sorted Array : "+ Arrays.toString(arr));
    }
}