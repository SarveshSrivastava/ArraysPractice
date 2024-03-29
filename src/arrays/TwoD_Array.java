package arrays;

import java.util.Arrays;

public class TwoD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]twoD=new int[3][2];
		twoD[0][0]=0;
		twoD[0][1]=3;
		twoD[1][0]=4;
		twoD[1][1]=0;
		twoD[2][0]=0;
		twoD[2][1]=5;
		System.out.println(Arrays.toString(twoD[0]));
		System.out.println(Arrays.toString(twoD[1]));
		System.out.println(Arrays.toString(twoD[2]));
	}

}
