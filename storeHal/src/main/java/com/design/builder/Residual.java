package com.design.builder;

public class Residual {

	public static void main(String[] args) {
		returnResudu(10,2,5);

	}
	
	public static int  returnResudu(int  amount , int cost , int requiredForResudu ) 
	{
		int result = amount/cost;
		int remCandles=     amount/cost;
		while( remCandles >0)
		{
			result= result+remCandles/requiredForResudu;
			remCandles=remCandles/requiredForResudu + remCandles%requiredForResudu;
			if(remCandles<requiredForResudu) 
			{
				break;
			}	
		}
		return result;
	}

}
