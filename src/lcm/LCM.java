package lcm;

public class LCM {
	
	public static void main(String[] args) {
		int a = 4, b = 0;
		int gcd = 1;
		int lcm = 1;
		
		if(a>b) {
			a += b;
			b = a-b;
			a -= b;
		}
		
		for(int i=1; i<a; i++) {
			if(a%i==0 && b%i==0) {
				a = a/i;
				b = b/i;
				gcd = gcd*i;
			}
		}
		
		lcm = gcd*a*b;
		
		System.out.println("GCD is: "+gcd);
		System.out.println("LCM is: "+lcm);
	}
}
