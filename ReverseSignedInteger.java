
//Given a 32-bit signed integer, reverse digits of an integer.
//Note:
/*Assume we are dealing with an environment which could only 
store integers within the 32-bit signed integer range: [−2 to power 31,  (2 to power 31) − 1]. 
For the purpose of this problem, assume that your function returns 0 when 
the reversed integer overflows.
*/
class ReverseSignedInteger {
    public int reverse(int x) {
      int oldNum = 0;
        if(x < 0)
             oldNum = -1*x;
        else 
             oldNum = x;
        
        int reverseNum=0;
        int prevReverseNum = 0;
        while(oldNum > 0)
        {
            reverseNum = reverseNum*10 + (oldNum%10);
            if((reverseNum - (oldNum%10))/10 != prevReverseNum)
            {
                return 0;
            }
            oldNum = oldNum/10;
            prevReverseNum=reverseNum;
            
        }
        if(x < 0)
        {
            return -1*reverseNum;
        }else
        {
            return reverseNum;
        }
        
        
    }   
    }