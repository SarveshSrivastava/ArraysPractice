package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Positive_Negative_Even_Odd_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int []inputArray=new int[20];
		for(int i =0; i<20;i++) {
			System.out.println("Enter element no "+(i+1));
			inputArray[i]=sc.nextInt();
		}
		Map<String,Integer> map=new HashMap<>();
		map.put("POSITIVE", (int)(Arrays.stream(inputArray).filter(x->x>0).count()));
		map.put("NEGATIVE", (int)(Arrays.stream(inputArray).filter(x->x<0).count()));
		map.put("EVEN", (int)(Arrays.stream(inputArray).filter(x->x%2==0).count()));
		map.put("ODD", (int)(Arrays.stream(inputArray).filter(x->x%2!=0).count()));
		map.put("ZERO", (int)(Arrays.stream(inputArray).filter(x->x==0).count()));
		System.out.println(map);
	}

}
