package codeWar;



public class reverseIf5words {

	public static void main(String[] args) {
		// aw parcha coda dagare banaw rstayakda har wshayak la 5 pit zyatr bw reverse dakat
		String rsta="hello world blnd chon save bkam chawakam";
		
		System.out.println(spinWords(rsta));
		
		
		
	}
	 public static  String spinWords(String sentence) {
		 StringBuilder sBuilder=new StringBuilder();// aw class a methode zor basudy tedaya bo String
			
			String arr[]=sentence.split(" ");// rstaka daxayna arrayawa
			for (int i = 0; i < arr.length; i++) {
			
				if(arr[i].length()>=5) {
					sBuilder.append(arr[i]);//zyad krdne wsha bo objecte classaka
				arr[i]=	sBuilder.reverse().toString();// wshay naw objectaka reverse daka pashan dayka ba String
				
				sBuilder.delete(0, arr[i].length());// pashan objectaka batal dakaynawa
				}
			}
			return String.join(" ", arr);// awash join krdne arrayaka la string bahoy space
		  }
}
