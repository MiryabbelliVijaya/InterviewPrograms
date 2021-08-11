package DailyInterviewPrograms;

public class GivenNumberIsBinaryOrNot {
	
	public static void isBinary(int num)
	{
		int copynum=num;
		boolean binaryFlag=true;
		while(copynum!=0)
		{
			num=num%10;
			if(num>1)
			{
				binaryFlag=false;
				break;
			}
			else {
				copynum=copynum*10;
			}
				
		}
		if (binaryFlag)
		{
			System.out.println(copynum+ "This is a binarynumber");
		}
			else
			{
			System.out.println(copynum+ "This is not a binarynumber");
		}
	}

	public static void main(String[] args) {
	  
		isBinary(111001);
	}

}
