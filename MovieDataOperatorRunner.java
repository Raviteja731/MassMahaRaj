class MovieDataOperatorRunner{
	
	public static void main(String...Pics){
		
		MovieDataOperator.displayDetails();
		
		System.out.println("Updated Movie Names");
	MovieDataOperator.save("Kick");
	MovieDataOperator.save("Idoit");
	MovieDataOperator.save("Vikramarkudu");
	MovieDataOperator.save("Raja The Great");
	MovieDataOperator.save("Khalidi");
	MovieDataOperator.save("Dharuvu");
	
	MovieDataOperator.displayDetails();
	}
}