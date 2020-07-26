import java.util.Arrays;

/*Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.*/

class ValidAnagram {
	   public boolean isAnagram(String s, String t) {
	        
	        if(s.length() != t.length())
	            return false;
	        char[] arr1 = s.toCharArray();
	        char[] arr2 = t.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        String s1 = new String(arr1);
	        String s2 = new String(arr2);
	        if(s1.equals(s2))
	        {
	            return true;
	        }else
	        {
	            return false;
	        }
	    
	    }
}
