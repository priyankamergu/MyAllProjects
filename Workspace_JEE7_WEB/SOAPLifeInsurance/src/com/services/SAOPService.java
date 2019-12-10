package com.services;

public class SAOPService 
{
	public double calculate(int term,int rate,double sumAssured)
	{
		double premium=(sumAssured * rate)/(term * 100 *12);
		return premium;
	}
	public String calculatePremium(int age,int term_of_Insurance,String smokingHabit,String accidentBenifit,double sumAssured)
	{
		final int rate1=6;
		final int rate2=8;
		double premium=0.0;
		String res;
		if(age <18 || age>50)
		{
	
			res="Not Eligible for Insurance";
		}
		else
		{
			if(age>=18 && age<=33)
			{
				premium=calculate(term_of_Insurance, rate1, sumAssured);
			}
			else
			{
				premium=calculate(term_of_Insurance, rate2, sumAssured);
			}
			
			if(smokingHabit.equalsIgnoreCase("yes"))
			{
				premium=premium + (premium *0.1);
			}
			if(accidentBenifit.equalsIgnoreCase("yes"))
			{
				premium = premium + (premium *0.1);
			}
				res="Your Premium is "+premium;
		}
		return res;
	}
}
