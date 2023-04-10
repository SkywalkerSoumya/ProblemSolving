package reverseString;

public class revString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		String res = "";
		
		for (int i=str.length()-1;i>=0;i--) {
			res += str.charAt(i);
		}
		
		System.out.println(res);

	}

}
