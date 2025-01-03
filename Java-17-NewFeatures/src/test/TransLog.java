package test;

import java.util.*;

public record TransLog(long hAccNo,long bAccNo,double amt,Date dateTime)
{
	public TransLog  //compact constructor
	{
		if(amt<=0)
		{
			throw new IllegalArgumentException("Invalid amt...");
		}
	}
}
