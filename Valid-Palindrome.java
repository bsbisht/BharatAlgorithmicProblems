/**
 * 
 */

/**
 * @author bhabisht
 *
 */

/** Question : Given a non-empty string s, 
 * you may delete at most one character. Judge whether you can make it a palindrome.
 * The string will only contain lowercase characters a-z. The maximum length of the string is 50000. */
class Solution {
    public boolean validPalindrome(String s) {
     char[] arr = s.toCharArray();
    int count = 0;
	for(int left = 0,right = arr.length - 1;left < right;)
	{
		if(arr[left] == arr[right])
		{
			left++;
			right--;
		}
		else
		{
            if(count == 0)
            { 
            if(arr[left] == arr[right - 1] && arr[left+1] == arr[right])
			{
				if(isPalindrome(arr, left + 1, right-2) || isPalindrome(arr, left+2, right-1))
				{
					return true;
				}
                else
                {
                    return false;
                }
			}    
			else if(arr[left] == arr[right - 1])
			{
				right = right - 2;
				left++;
                count++;
			}else if(arr[left+1] == arr[right])
			{
				left = left + 2;
				right--;
                count++;
			}else
			{
				return false;
			}
            }else
            {
                return false;
            }
		}
		
	}   
        
        return true;
        
    }
    
    
     boolean isPalindrome(char[] arr,int left, int right)
	{
		for(;left < right;)
		{
			if(arr[left] == arr[right])
			{
				left++;
				right--;
			}else				
			{
				return false;
			}
		}
		return true;
	}
	
    
}