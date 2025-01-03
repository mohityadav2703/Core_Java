package test;

import java.util.Date;

public class TransLog 
{
	private final long hAccNo,bAccNo;
	private final double amt;
	private final Date dateTime;
	
	public TransLog(long hAccNo,long bAccNo,double amt,Date dateTime)
	{
		this.hAccNo=hAccNo;
		this.bAccNo=bAccNo;
		this.amt=amt;
		this.dateTime=dateTime;
	}

	public long gethAccNo() {
		return hAccNo;
	}

	public long getbAccNo() {
		return bAccNo;
	}

	public double getAmt() {
		return amt;
	}

	public Date getDateTime() {
		return dateTime;
	}
	
}
