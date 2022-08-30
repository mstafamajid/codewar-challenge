package codeWar;

public class ArrayMinusArray {

	public static void main(String[] args) {
		int[] a = { 1, 6, 2, 2, 5 };
		int[] b = { 1, 2, 5 };
		System.out.println();
	}

	static public int[] arraysMinus(int a[], int b[]) {

		int size = a.length;

		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < a.length; j++)
				if (b[i] == a[j]) {
					a[j] = 0;
					size--;
				}
		int array[] = new int[size];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] != 0) {
				array[j] = a[i];
				j++;
			}
		}

		return array;

	}

}
