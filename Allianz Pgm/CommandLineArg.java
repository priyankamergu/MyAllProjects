class CommandLineArg
{
	public static void main(String args[])
	{
		Integer no1=Integer.parseInt(args[0]);
		Integer no2=Integer.parseInt(args[1]);
		System.out.print("\nAddition of two Numbers : "+(no1+no2));
		System.out.print("\nSubstraction of two Numbers : "+(no1-no2));
		System.out.print("\nMultiplication of two Numbers : "+(no1*no2));
		System.out.print("\nDivision of two Numbers : "+(no1/no2));
	}
}