package DailyInterviewPrograms;

public class IsValidPHCCCNumber {
	
	public static boolean isValidphNumRex(String num)
	{
		//return num.matches("[0-9]{10}");
		return num.matches("\\d{10}");
	}
	public static boolean isValidCCNumRex(String num)
	{
		//return num.matches("[0-9]{10}");
		return num.matches("^(-?\\d+\\.)?-?\\d+$");
	}
	
	public static boolean isValidNum(String num)
	{
		try
		{
			Long.parseLong(num);
			System.out.println("Given number is a valid number : "+" "+num);
			return true;
		}
		catch(NumberFormatException e)
		{
			System.out.println("Given number is not a valid number : "+" "+num);
		}
		return false;
	}
	
	public static void isValidPhNum(String num)
	{
		if(num.length() == 10 &&  isValidNum(num))
	
			System.out.println("Given number is valid phnumber : "+" "+num);
		
		else
	
			System.out.println("Given number is not a valid phnumber : "+" "+num);

		
	}
	public static void isValidCCNum(String num)
	{
		if(num.length() == 16 &&  isValidNum(num))
	
			System.out.println("Given number is valid CC number : "+" "+num);
		
		else
	
			System.out.println("Given number is not a validCC number : "+" "+num);

		
	}

	public static void main(String[] args) {
	
		isValidNum("123");
		isValidPhNum("7896");
		isValidPhNum("12345678934536365");
		isValidCCNum("37463274535");
		isValidCCNum("1234567893453636");
		isValidphNumRex("1234567898");
	System.out.println(isValidphNumRex("1234583456"));	
	System.out.println(isValidCCNumRex("123.45"));
	}

}
