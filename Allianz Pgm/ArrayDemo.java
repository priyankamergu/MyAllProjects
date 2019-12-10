import java.util.*;
class ArrayDemo
{
	public static void main(String args[])
	{
		ArrayDemo a=new ArrayDemo();
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter any five values : ");
		for(int i=0;i<5;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.print("\nArray Value : ");
		a.display(arr);
		System.out.print("\nAsceding Value : ");
		a.arrayAsceding(arr);
		System.out.print("\ndeceding Value : ");
		a.arrayDecending(arr);
		
	}
	public void arrayAsceding(int[] arr)
	{
		int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		display(arr);
	}
	public void arrayDecending(int[] arr)
	{
		int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		display(arr);
	}
	public void display(int[] arr)
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}