class FoodItemsDataOperatorRunner{
	
	public static void main(String...ra){
		
		FoodItemsDataOperator.displayDetails();
		
	System.out.println("Updated Food Menu");
		FoodItemsDataOperator.save("Depends On Budjet");
		FoodItemsDataOperator.save("Voganni Bajji");
		FoodItemsDataOperator.save("Puri");
		FoodItemsDataOperator.save("Rice Samber");
		FoodItemsDataOperator.save("Palavu");
		FoodItemsDataOperator.save("Dosa");
		
		FoodItemsDataOperator.displayDetails();
	}
}