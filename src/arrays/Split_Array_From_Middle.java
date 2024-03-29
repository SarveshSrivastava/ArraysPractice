package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Split_Array_From_Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int []inputArray=new int[10];
		for(int i =0; i<10;i++) {
			System.out.println("Enter element no "+(i+1));
			inputArray[i]=sc.nextInt();
		}
		int []firstHalf=new int[inputArray.length/2];
		int []secondHalf=new int[inputArray.length/2];
		for(int i=0;i<inputArray.length;i++) {
			if(i<inputArray.length/2)
				firstHalf[i]=inputArray[i];
			else if(i>=inputArray.length/2&&i<inputArray.length)
				secondHalf[i-(inputArray.length/2)]=inputArray[i];
		}
		System.out.println(Arrays.toString(firstHalf));
		System.out.println(Arrays.toString(secondHalf));
	}

}
