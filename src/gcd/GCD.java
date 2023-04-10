package gcd;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 150, b = 950;
		
		if(a==0)
			System.out.println("GCD is: "+b);
		else if(b==0)
			System.out.println("GCD is: "+a);
		else {
			while(a!=b) {
				if(a>b)
					a-=b;
				else
					b-=a;
			}
			
			System.out.println("GCD is: "+a);
		}
	}

}
