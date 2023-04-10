package factorial;

import java.math.BigInteger;

public class LargeFact {
	
	static BigInteger fact(int n) {
		BigInteger num = new BigInteger("1");
		int i=2; 
		while(i<=n) {
			num = num.multiply(BigInteger.valueOf(i));
			i++;
		}
		return num;
	}

	public static void main(String[] args) {
		//BigInteger num = new BigInteger("1");
		
		int n = 50;
		
		System.out.println(fact(n));
	}

}
