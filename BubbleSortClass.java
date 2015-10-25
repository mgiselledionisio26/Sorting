class BubbleSortClass {
	
	int [] num;
	
	public BubbleSort (int size)
	{
		num = new int [size];
	}	

	public void insert (int index, int value){
		num [index] = value;
	}

	public void display (){
		for ( int i = 0; i < num.length; i++){
			System.out.print(num[i] + " ");
		}
	}

	public void Sort (){
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
	}

}
