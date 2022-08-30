package codeWar;

import java.math.BigInteger;

public class countZeros {

	public static void main(String[] args) {
		
		BigInteger fact = BigInteger.valueOf(1);
		for (int i = 1; i <= 5; i++)
			fact = fact.multiply(BigInteger.valueOf(i));

System.out.println(fact);
System.out.println((fact+"").length()-((fact+"").replaceAll("0", "").length()));

	}

}
