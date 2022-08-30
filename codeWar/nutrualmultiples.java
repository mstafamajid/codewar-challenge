package codeWar;

public class nutrualmultiples {

	public static void main(String[] args) {

		System.out.println(naturalSumBelow(15));
	}

	static int naturalSumBelow(int num) {
		int sum = 0;
		for (int i = 0; i < num; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;

		return sum;
	}

}
