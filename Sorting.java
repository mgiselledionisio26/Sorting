public class Sorting {
	public static void main (String[]args)
	{
		int [] num = {8, 1, 3, 7, 6, 5};
		int tmp;

		// display numbers
		System.out.println ("Before Sort ... ");

		for ( int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
		// Bubble Sort
		for (int i = 0; i < num.length - 1; i++)
		{
			for ( int a = 0; a < num.length - 1; a++)		
			{
				if (num [a] > num [a+1]) 
				{ 
					// swap
					tmp = num [a]; 
					num [a] = num [a+1];
					num [a+1] = tmp;
				}
			} 
		}
		// display numbers
		System.out.println ("\n \n After Sort ... ");

		for ( int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
	}
}