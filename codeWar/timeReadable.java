package codeWar;

public class timeReadable {

	public static void main(String[] args) {
		System.out.println(makeReadable(133));
		
	}
	
	
	 public static String makeReadable(int seconds) {
		    
		
		 
	
		 
		
		 

		 
		 return String.format("%02d",seconds/3600)+"::"+String.format("%02d",seconds/60%60)+"::"+String.format("%02d",seconds%60);
		 
		 
		 
		 
		 
		 
		  }

}
