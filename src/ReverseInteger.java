/*Complexity Analysis

Time Complexity: O(\log(x))O(log(x)). 
Space Complexity: O(1)O(1).*/


public class ReverseInteger {
	public int reverseIntegerNumber(int input)
	{
		int output=0;
		int pop=0;
		while(input!=0)
		{
			pop		=	input%10;
			input	=	input/10;
			if(output>Integer.MAX_VALUE/10||output==Integer.MAX_VALUE/10&&pop>7) {return 0;}
			if(output<Integer.MIN_VALUE/10||output==Integer.MIN_VALUE/10&&pop<-8) {return 0;}
			output=output*10+pop;
				
		}
		return output;
		
		
	}
	
	public static void main(String args[])
	{
		ReverseInteger RI=new ReverseInteger();
		
		
		System.out.println(RI.reverseIntegerNumber(1089));
	}
}
