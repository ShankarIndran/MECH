package week2day2;

public class FindInterSection {
	public static void main(String arg[])
	{
		int[] arr1= {8,2,10,4,6,7};
		int[] arr2= {1,2,8,11,9,7};
		
	for(int i=0; i<arr1.length; i++)
		
	{
		for(int j=0; j<arr2.length; j++)
		{
			if(arr1[i]==arr2[j])
			{
			 System.out.println("match item in both arrays"+" " +arr1[i]);
			}
		}
			
	}

}

}
