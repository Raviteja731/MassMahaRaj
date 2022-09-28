class Colour{
	
	static String[] colours = {null,null,null,null,null,null,null};
	static int position = 0;
	static void save(String rainbow)
	{
		  colours[position]=rainbow;
		position++;
		if(rainbow!=null&& rainbow.length()>3)
		{
		System.out.println("rainbow is pointing to null or not having more than 3 char");	
		}else
		{
			System.out.println("rainbow is notpointing to null");
		}
		if(position>7)
		{
			System.out.println("rainbow colour is exceds");
		}else
		{
			System.out.println("rainbow colour is not exceds");
		}
	}
	static void displayDetails()
	{
		for(int index=0;index<colours.length;index++)
		{
			String ref = colours[index];
			System.out.println("Rainbow colours :"+ref);
		}
	}
	static boolean findcolour(String colour)
	{
	if(colour!=null && colour.length()>3)
	{
		System.out.println("valid colour");
		for(int find=0;find<colours.length;find++)
		{
			String ref = colours[find];
			
			if(ref==colour)
			{
				System.out.println("colour is found in array");
				return true;
			}else
			{
				System.out.println("colour is not found in array");
				
			}
		}
	}return false;
	}
}