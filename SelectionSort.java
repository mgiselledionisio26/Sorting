class SelectionSort {
	public static void main (String[]args)
	{
		int [] num = {8, 1, 3, 7, 6, 5};
		int min, tmp;

		// display numbers
		System.out.println ("Before Sort ... ");

		for ( int i = 0; i < num.length; i++){
			System.out.print(num[i] + " ");
		}

		// Selection Sort
		for ( int i = 0; i < num.length - 1 ; i++) {
			min = i;

			// purpose makita ung index na may maliit na value
			for (int a = i;  a < num.length - 1; i++)
			{
				if ( num [min] > num [a+1] ){
					min = a+1;
				}
			}
			tmp = num[i];
			num [i] = num[min];
			num [min] = tmp; 

		}
		// display numbers
		System.out.println ("\n \n After Sort ... ");

		for ( int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
	}
}