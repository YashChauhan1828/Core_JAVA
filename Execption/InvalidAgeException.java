package Execption;

//User Defined / Custom Exception

//public class InvalidAgeException extends Exception
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}
