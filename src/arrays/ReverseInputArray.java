package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []inputArray=new int[10];
		int []outputArray=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<inputArray.length;i++) {
			System.out.println("Enter element : "+(i+1));
			inputArray[i]=sc.nextInt();
		}
		for(int j=0;j<inputArray.length;j++) {
			outputArray[j]=inputArray[inputArray.length-j-1];
		}
		System.out.println(Arrays.toString(outputArray));
		System.out.println(Arrays.toString(inputArray));
	}

}
