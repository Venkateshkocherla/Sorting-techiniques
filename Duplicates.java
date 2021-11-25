import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
      System.out.println ("Enter the length of the array :");
    int len = input.nextInt ();
    int[] arr = new int[10];
    for (int i = 0; i < len; i++)
      {
	arr[i] = input.nextInt ();
      }
    for (int i = 0; i < len; i++)
      {
	for (int j = i + 1; j < len; j++)
	  {
	    if (arr[i] == arr[j])
	      {
		System.out.println ("The Duplicates are " + arr[j]);
		arr[i] = -1;
	      }
	  }
      }
  }
}
