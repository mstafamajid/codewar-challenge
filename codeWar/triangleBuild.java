package codeWar;

public class triangleBuild {

	public static void main(String[] args) {
		System.out.println(triangle(7,2,6));

	}
	static boolean triangle(int a,int b,int c) {
		
		
		
		return a+b>c&&b+c>a&&c+a>b;
		
	}
}
