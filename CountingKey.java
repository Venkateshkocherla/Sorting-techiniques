import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int len  = input.nextInt();
         System.out.println("Enter the element to be counted :");
        int key  = input.nextInt();
        System.out.println("Enter the elements of the array:");
        int count = 0; 
        int []arr = new int[10];
	    for(int i = 0;i<len;i++){
	        arr[i] = input.nextInt();
	    }
	    for(int i = 0;i<len;i++){
	         if(arr[i] == key){
	             count+=1;
	         }
	    }
	    System.out.println("The count of the element is "+count);
	             
	             
    }
}
