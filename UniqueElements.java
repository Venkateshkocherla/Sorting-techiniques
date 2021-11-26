import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int len  = input.nextInt();
        int count = 0; 
        int []arr = new int[10];
        int []ar = new int[10];
        int j;
	    for(int i = 0;i<len;i++){
	        arr[i] = input.nextInt();
	    }
	    for(int i = 0;i<len;i++){
	        for(j = i+1;j<len;j++){
            if (arr[i]==arr[j]){
                break;
	            }
	        }
	   if (j==len){
	       count+=1;
	   }
	    }
	    System.out.println("Number of unique elements are "+count);
    }
}
