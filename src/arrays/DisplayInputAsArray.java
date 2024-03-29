package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayInputAsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int []inputArray=new int[10];
		for(int i =0; i<10;i++) {
			System.out.println("Enter element no "+(i+1));
			inputArray[i]=sc.nextInt();
		}
		System.out.println("Input Array : "+Arrays.toString(inputArray));

	}

}
