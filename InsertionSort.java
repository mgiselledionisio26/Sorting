public class InsertionSort{
	public static void main (String[]args)
	{
		int [] num = {8, 1, 3, 7, 6, 5};
		int tmp, pointer;

		// display numbers
		System.out.println ("Before Sort ... ");

		for ( int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
		// InsertionSort
		for (int i = 1; i < num.length; i++ ) {
			pointer = i;
			tmp = num[pointer];

			while ( pointer > 0 && num[pointer - 1 > tmp ]){
				num [pointer] = num [pointer - 1];
				
				pointer --; 
			}
			 
			num [pointer] = tmp;
		}


		// display numbers
		System.out.println ("\n \n After Sort ... ");

		for ( int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
	}
}