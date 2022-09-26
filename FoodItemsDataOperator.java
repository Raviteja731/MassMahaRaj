class FoodItemsDataOperator{
	
	static String[] FoodItems = {null,null,null,null,null,null};
	static int position = 0;
	static void save(String items)
	{
		FoodItems[position]=items;
		position++;
	}
	static void displayDetails()
	{
		for(int index=0;index<FoodItems.length;index++)
		{
			String ref = FoodItems[index];
			System.out.println("Items Menu :"+ref);
		}
	}
}