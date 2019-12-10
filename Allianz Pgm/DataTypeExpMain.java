
class DataTypeExp
{
	public void ByteDataType()
	{
		Byte by=58;
		System.out.println("\n\nByte :"+by);
		System.out.println("Byte Min Value "+Byte.MIN_VALUE);
		System.out.println("Byte Max Value "+Byte.MAX_VALUE);
	}
	public void ShortDataType()
	{
		Short s=6754;
		System.out.println("\n\nShort :"+s);
		System.out.println("Short Min Value "+Short.MIN_VALUE);
		System.out.println("Short Max Value "+Short.MAX_VALUE);
	}
	public void IntegerDataType()
	{
		Integer i=5677;
		System.out.println("\n\nInteger :"+i);
		System.out.println("Integer Min Value "+Integer.MIN_VALUE);
		System.out.println("Integer Max Value "+Integer.MAX_VALUE);
	}
	public void LongDataType()
	{
		Long l=8567866l;
		System.out.println("\n\nLong :"+l);
		System.out.println("Long Min Value "+Long.MIN_VALUE);
		System.out.println("Long Max Value "+Long.MAX_VALUE);
	}
	public void FloatDataType()
	{
		Float f=8.7f;
		System.out.println("\n\nFloat :"+f);
		System.out.println("Float Min Value "+Float.MIN_VALUE);
		System.out.println("Float Max Value "+Float.MAX_VALUE);
	}
	public void DoubleDataType()
	{
		Double d=345.2345;
		System.out.println("\n\nDouble :"+d);
		System.out.println("Double Min Value "+Double.MIN_VALUE);
		System.out.println("Double Max Value "+Double.MAX_VALUE);
	}
	public void CharacterDataType()
	{
		Character c='p';
		System.out.println("\nCharacter :"+c);
		System.out.println("Character  Min Value "+Character.MIN_VALUE);
		System.out.println("Character  Max Value "+Character.MAX_VALUE);
	}
	public void BooleanDataType()
	{
		Boolean b=false;
		System.out.println("\n\nBoolean :"+b);
		//System.out.println("Boolean Min Value "+Boolean.MIN_VALUE);//Error Cannot find symbol
		//System.out.println("Boolean Max Value "+Boolean.MAX_VALUE);//Error Cannot find symbol
	}
}
class DataTypeExpMain 
{

	public static void main(String args[])
	{
		//int i;
		//System.out.print(" "+i);
		DataTypeExp d=new DataTypeExp();
		d.ByteDataType();
		d.ShortDataType();
		d.IntegerDataType();
		d.LongDataType();
		d.FloatDataType();	
		d.DoubleDataType();
		d.BooleanDataType();

		
	}
}