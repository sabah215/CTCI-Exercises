package ChapOneArraysAndString;

/*
 *  Exercise 1.1
 *  IsUnique: Implement an algorithm to determine if a string has all unique characters. 
 *  What if you cannot use any additional data structures? 
 *  
 * */

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isUnique("cat"));

	}
	
	public static boolean isUnique(String s) {
		
		for (int i=0; i< s.length()-1; i++) {
			
			if(s.charAt(i) == s.charAt(i + 1)) {
				return false;
			}
			
		}
		
		return true;
		
	}

}
