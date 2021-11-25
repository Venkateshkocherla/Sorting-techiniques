import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the length of the array :");
	    int len  = input.nextInt();
	    System.out.println("Enter the element to be searched :");
	    int key  = input.nextInt();
	    int []arr = new int[10];
	    for(int i = 0;i<len;i++){
	        arr[i] = input.nextInt();
	    }
	     for(int i = 0;i<len;i++){
	         if(arr[i] == key){
	             System.out.println("The index of the key is "+i);
	             break;
	         }
	     }
