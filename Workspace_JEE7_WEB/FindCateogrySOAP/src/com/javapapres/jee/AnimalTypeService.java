package com.javapapres.jee;

public class AnimalTypeService
{
	public String animalType(String animal)
	{
		String typeName="";
		if("Lion".equals(animal))
		{
			typeName="wild";
			
		}
		else if("Dog".equals(animal))
		{
			typeName="Domestic";
		}
		else
		{
			typeName="I Dont Know";
		}
		return typeName;
	}
}
