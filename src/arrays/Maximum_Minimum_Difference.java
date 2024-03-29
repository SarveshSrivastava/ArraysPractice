package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Minimum_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of input array");
		Scanner sc=new Scanner(System.in);
		int []inputArray=new int[sc.nextInt()];
		for(int i=0;i<inputArray.length;i++) {
			System.out.println("Enter element "+(i+1));
			inputArray[i]=sc.nextInt();
		}
		Arrays.sort(inputArray);
		System.out.println(Arrays.toString(inputArray));
		int minimumDifference=inputArray[inputArray.length-1]-inputArray[inputArray.length-2];
		int maximumDifference=inputArray[inputArray.length-1]-inputArray[0];
		System.out.println("MinimumDifference : "+minimumDifference+"\tMaximumDifference : "+maximumDifference);
	}

}
