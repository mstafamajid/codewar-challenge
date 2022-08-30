package codeWar;

import java.util.Arrays;

public class sortOddArray {

	public static void main(String[] args) {
		int array[] = { 3,4,7,1,2,8,3,5 };

		int countodd = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0)
				countodd++;
		}
		int arOfNum[] = new int[countodd];
		for (int i =0,j=0; i < array.length; i++) {

			
			if(array[i]%2!=0) {
				arOfNum[j]=array[i];
				j++;
			}
		}
		Arrays.sort(arOfNum);
		
		for (int i =0,j=0; i < array.length; i++) {
			if(array[i]%2!=0) {
				array[i]=arOfNum[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
