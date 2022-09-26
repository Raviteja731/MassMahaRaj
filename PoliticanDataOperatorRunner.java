class PoliticanDataOperatorRunner{
	
	public static void main(String...Ra){
		
		PoliticanDataOperator.displayDetails();
		
		System.out.println("Updated Politican Names");
		
		PoliticanDataOperator.save("Omkar");
		PoliticanDataOperator.save("Vinay");
		PoliticanDataOperator.save("Vinoda");
		PoliticanDataOperator.save("Lokesh");
		PoliticanDataOperator.save("Akshara");
		PoliticanDataOperator.save("Devendra");
		
		PoliticanDataOperator.displayDetails();
	}
}