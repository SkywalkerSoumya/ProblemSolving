package vowel;

public class Vowel {
	
	public static String change_vowel_ToUpper(String str) {
		
		String res = "";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a')
				res += 'A';
			else if(str.charAt(i)=='e')
				res += 'E';
			else if(str.charAt(i)=='i')
				res += 'I';
			else if(str.charAt(i)=='o')
				res += 'O';
			else if(str.charAt(i)=='u')
				res += 'U';
			else
				res += str.charAt(i);
				
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hellO";
		
		System.out.println(change_vowel_ToUpper(string));
		
		

	}

}
