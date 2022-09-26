class PoliticanDataOperator{
	
	static String[] PoliticanData={null,null,null,null,null,null};
	
	static int position=0;
	static void save(String names)
	{
		PoliticanData[position]=names;
		position++;
	}
	static void displayDetails()
	{
	  for(int index=0;index<PoliticanData.length;index++)
	  {
		  String ref = PoliticanData[index];
		  System.out.println("Politican Names :"+ref);
	  }		  
	} 
}