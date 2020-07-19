
/** 
Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same backward as forward.
We would do it without converting the integer to string
*/
class PalindromeNumber {
    public boolean isPalindrome(int x) {
		
		int y = x;
		if( x < 0)
		{
			return false;
		}
		else
		{
			int highestDivisor  = 1;
			while(y >= 10)
			{
				y = y/10;
				highestDivisor = highestDivisor*10;
			}
			int lowerDivisor = 10;
			float a = 1;
			while(highestDivisor >= lowerDivisor)
			{   
				int leftMostDigit = (x/highestDivisor)%10;
				int rightMostDigit = (x%lowerDivisor)/(lowerDivisor/10);
				if(leftMostDigit != rightMostDigit)
				{
					return false;
				}
				a++;
				lowerDivisor = (int)Math.pow(10,a);
				highestDivisor = highestDivisor/10;
			}
			return true;
			
		} 
    }
}