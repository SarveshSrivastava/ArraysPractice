package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Product_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int []inputArray=new int[10];
		for(int i =0; i<10;i++) {
			System.out.println("Enter element no "+(i+1));
			inputArray[i]=sc.nextInt();
		}
		int sum=Arrays.stream(inputArray).sum();
		int product=Arrays.stream(inputArray).reduce(1,(a,b)->a*b);
		System.out.println("product : "+product+"\nsum : "+sum);
	}

}
