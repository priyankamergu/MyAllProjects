class AscciCode
{
	public static void main(String args[])
	{
		AscciCode a=new AscciCode();
		System.out.print("Small letter Code ....!\n");
		a.smallCharacterCode();
		System.out.print("\n\nCaptial letter Code ....!\n");
		a.captialCharacterCode();
		System.out.print("\n\nSpecial Character Code ....!\n");
		a.specialCharacterCode();
		System.out.print("\n\nNumber Code : ");
		a.NumberAscciCode();
	}
	public void smallCharacterCode()
	{
		char c='a';
		int i=(int)c;	
		for(int j=0;j<=25;j++)	
		{
			System.out.print("\nSmall Letter "+(char)i+" Code : "+(int)i);
			i++;
		}
	}
	public void captialCharacterCode()
	{
		char c='A';
		int i=(int)c;	
		for(int j=0;j<=25;j++)	
		{
			System.out.print("\nCaptial Letter "+(char)i+" Code : "+(int)i);
			i++;
		}
	}
	public void NumberAscciCode()
	{
		char c='0';
		int i=(int)c;
		for(int j=0;j<=9;j++)
		{
			System.out.print("\nNumber "+(char)i+" code : "+(int)i);
			i++;
		}
	}
	public void specialCharacterCode()
	{
		System.out.print("\nSpecial Character "+'!'+" Code : "+(int)'!');
		System.out.print("\nSpecial Character "+'@'+" Code : "+(int)'@');
		System.out.print("\nSpecial Character "+'#'+" Code : "+(int)'#');
		System.out.print("\nSpecial Character "+'$'+" Code : "+(int)'$');
		System.out.print("\nSpecial Character "+'%'+" Code : "+(int)'%');
		System.out.print("\nSpecial Character "+'*'+" Code : "+(int)'*');
		System.out.print("\nSpecial Character "+'('+" Code : "+(int)'(');
		System.out.print("\nSpecial Character "+')'+" Code : "+(int)')');
		System.out.print("\nSpecial Character "+'-'+" Code : "+(int)'-');
		System.out.print("\nSpecial Character "+'+'+" Code : "+(int)'+');
		System.out.print("\nSpecial Character "+'/'+" Code : "+(int)'/');
		System.out.print("\nSpecial Character "+'_'+" Code : "+(int)'_');
		System.out.print("\nSpecial Character "+'='+" Code : "+(int)'=');
		System.out.print("\nSpecial Character "+','+" Code : "+(int)',');
		System.out.print("\nSpecial Character "+'.'+" Code : "+(int)'.');
		System.out.print("\nSpecial Character "+'?'+" Code : "+(int)'?');
		System.out.print("\nSpecial Character "+'<'+" Code : "+(int)'<');
		System.out.print("\nSpecial Character "+'>'+" Code : "+(int)'>');
		System.out.print("\nSpecial Character "+'{'+" Code : "+(int)'{');
		System.out.print("\nSpecial Character "+'}'+" Code : "+(int)'}');
		System.out.print("\nSpecial Character "+'['+" Code : "+(int)'[');
		System.out.print("\nSpecial Character "+']'+" Code : "+(int)']');
		System.out.print("\nSpecial Character "+':'+" Code : "+(int)':');
		System.out.print("\nSpecial Character "+'"'+" Code : "+(int)'"');
		System.out.print("\nSpecial Character "+';'+" Code : "+(int)';');
		System.out.print("\nSpecial Character "+'|'+" Code : "+(int)'|');
		//System.out.print("\nSpecial Character "+'''+" Code : "+(int)''');
	}
}