package anagram;

import java.util.Arrays;

public class Anagram {
	
	   public static boolean isAnagram(String a,String b)
	    {
	        
	        // Your code here
	        char[] arrA = new char[a.length()];
	        // char[] arrA = a.toCharArray();
	        char[] arrB = new char[b.length()];
	        int flag = 0;
	        
	        if(a.length() != b.length())
	            return false;
	        else{
	            for(int i=0; i<a.length(); i++){
	                arrA[i] = a.charAt(i);
	                arrB[i] = b.charAt(i);
	            }
	        }
	        Arrays.sort(arrA);
	        Arrays.sort(arrB);
	        
	        for(int x=0;x<arrA.length;x++){
	            if(arrA[x] != arrB[x]){
	                flag = 1;
	                break;
	            }
	        }
	        if(flag==1)
	            return false;
	        else 
	            return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res = isAnagram("helloworld","worldhello");
		System.out.println(res);
		
		
	}

}
