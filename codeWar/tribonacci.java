package codeWar;

import java.util.Arrays;

public class tribonacci {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Tribonacci(new int[] {0,0,1}, 80)));

	}

	public static int[] Tribonacci(int[] s, int n) {

	
		int[] array = new int[n];
		for (int i =0; i < array.length; i++) 
			if(i<3)
				array[i]=s[i];
			else 
				array[i]=array[i-1]+array[i-2]+array[i-3];
			
			
			
				
			

		
		

		return array;

	}

}
