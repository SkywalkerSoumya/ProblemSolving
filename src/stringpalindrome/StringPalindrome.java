package stringpalindrome;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,res="";
		
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			res+=str.charAt(i);
		}
		
		if(str.toLowerCase().equals(res.toLowerCase())) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
