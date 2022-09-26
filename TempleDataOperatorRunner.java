class TempleDataOperatorRunner{
	
	public static void main(String...photos)
	
	{
			System.out.println("Main is Running");
		TempleDataOperator.displayDetails();
		
		System.out.println("Updated Names :");
		TempleDataOperator.save("Hampi",12);
		TempleDataOperator.save("Sharavanabelgola",14);
		TempleDataOperator.save("Mysore",15);
		TempleDataOperator.save("Ayodhya",48);
		TempleDataOperator.save("Dhurgamma Gudi",67);
		
	
	
	TempleDataOperator.displayDetails();
	
	System.out.println("Main over");
	
	
}
}