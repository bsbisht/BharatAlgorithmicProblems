
import java.util.HashMap;
import java.util.Map;

/** 
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
This is case sensitive, for example "Aa" is not considered a palindrome here.
*/

class LongestPalindrome {
    public int longestPalindrome(String s) 
    {
	 char[] arr = s.toCharArray();
	 Map<Character,Integer> charCount = new HashMap<>();
	 for(char c : arr)
	 {
		 if(charCount.containsKey(c))
		 {
			charCount.put(c, (charCount.get(c) + 1));
		 }
		 else
		 {
			 charCount.put(c, 1);
		 }
	 }
	 int palinDromeSize=0;
	 boolean mid = false;
	 for(char c :charCount.keySet())
	 {
		 int count = charCount.get(c);
		 if(count == 1)
		 {
			 if(!mid)
			 {
				 palinDromeSize = palinDromeSize + 1;
				 mid = true;
			 }
		 } 
		 else if(count%2 == 0)
		 {
			 palinDromeSize = palinDromeSize + count;
		 } 
		 else 
		 {
			 palinDromeSize = palinDromeSize +count - 1;
			 if(!mid)
			 {
				 palinDromeSize = palinDromeSize + 1;
				 mid = true;
			 }
		 }
	 }
	 return palinDromeSize;
	
        
    }
}