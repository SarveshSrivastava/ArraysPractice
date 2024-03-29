package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int []inputArray=new int[10];
		int []outputArray=new int[10];
		for(int i =0; i<10;i++) {
			System.out.println("Enter element no "+(i+1));
			inputArray[i]=sc.nextInt();
		}
		for(int j=0;j<inputArray.length;j++) {
			outputArray[j]=inputArray[inputArray.length-j-1];
		}
		if(Arrays.equals(inputArray, outputArray))
			System.out.println("is Palindrome");
		else
			System.out.println("is not Palindrome");
	}

}
