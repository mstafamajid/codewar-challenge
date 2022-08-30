package codeWar;

import java.util.Arrays;

public class Arraysqrt {

	public static void main(String[] args) {
		int[] b = {1,2,3,4};
		int[] a = {1,4,9,16};
		System.out.println(comp(a, b));

	}

	public static boolean comp(int[] a, int[] b) {

		if (a.length==0&&b==null) {
			return true;
		}

		
		if (a==null||b==null||a.length!=b.length) {
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i = 0; i < a.length; i++) {
			if(Math.sqrt(b[i])!=a[i]) {
				return false;
			}
		}
		return true;
	}

}
