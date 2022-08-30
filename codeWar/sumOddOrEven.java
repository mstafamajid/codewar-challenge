package codeWar;

public class sumOddOrEven {

	public static void main(String[] args) {
		System.out.println(oddOrEven(new int [] {1212,32,12,4}));
		
		}

	
	 public static String oddOrEven (int[] array) {
		int sum=0;
		for(int i:array)
		 sum+=i;
		 
		if(sum%2==0)
			return "even";
		return "odd";
		  
	  }

}
