package codeWar;

public class armstrong {

	public static void main(String[] args) {
		String num="153";
		int sum=0;
		
		for (int i = 0; i < num.length(); i++) {
			
			sum+=Math.pow(Integer.parseInt(""+num.charAt(i)), num.length());
		}
	
		if (sum==Integer.parseInt(num)) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("isnt");
		}
	}
}
		
	
	

		


