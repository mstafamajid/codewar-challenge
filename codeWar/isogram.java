package codeWar;

public class isogram {

	public static void main(String[] args) {
	
System.out.println(isogramcheck("mustaf"));
	}
	
	static boolean isogramcheck(String word) {
		word=word.toLowerCase();
		if(word.length()<=0)
			return true;
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i)==(word.charAt(j))&&i!=j) {
					return false;
				}
			}
		}
		
		
		
		return true;
		
	}

}
