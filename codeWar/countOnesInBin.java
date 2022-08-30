package codeWar;

public class countOnesInBin {

	public static void main(String[] args) {
		System.out.println(countBits(3));
		for (int i = 0; i <12; i++) {
			
		}

	}
	public static int countBits(int n){
		int sum=0;
	for (int i = 0; i < Integer.toBinaryString(n).length(); i++) {
		if(Integer.toBinaryString(n).charAt(i)=='1') {
			sum++;
		}
	}
		
		
		return sum;
		
	}
	
	// Integer.bitCount(n) awash hamuy daka

}
