package codeWar;

public class oddOccurs {

	public static void main(String[] args) {
		int arr[]={20,1,1,2,2,3,3,5,5,4,20,4,5};
		System.out.println(oddOccures(arr));
	}

static int oddOccures(int [] arr) {

	int element=0;
	int counter=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				counter++;
			}
			
		}
		if (counter%2==1) {
			return arr[i];
			
		}
		
		counter=0;
	}
return 0;
	}
}
