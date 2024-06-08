
public class CheckIntegerIsPalindrome {

	public boolean isPalindrome(int input)
	{
		int reversedInput=0;
		//Check for edge cases
		//Negative numbers are not palindrome
		//Numbers ending in 0 cant be a palindrome except 0
		if(input<0||input!=0 && input%10==0) 
		{
			return false;
		}
		//Reverse the input until we reach halfway
		//ie., until input is less than reversed number
		while(input>reversedInput)
		{
			reversedInput	=	reversedInput*10	+	input%10;
			input			=	input/10;
			
		}
		//Check if input and reversed input are the same
		//Incase of an odd number the last digit in reversed input could be the same as it is the middle digit and will always be the same
		
		return (input==reversedInput	||	input==reversedInput/10);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckIntegerIsPalindrome checkPalin=new CheckIntegerIsPalindrome();
		System.out.println(checkPalin.isPalindrome(12345));
		System.out.println(checkPalin.isPalindrome(12321));
		System.out.println(checkPalin.isPalindrome(1221));
		
		
	}

}
