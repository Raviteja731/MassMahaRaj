class ForestRunner{
	
	public static void main(String...jungle){
		
		/*String ref = Forest.Name;
		int area = Forest.area;
		String Type = Forest.Type;
		String Region = Forest.Region;
		String[] PrimaryAnimals = Forest.PrimaryAnimals;*/
		
		System.out.println("Forest Name :"+Forest.Name);
		System.out.println("forestArea :"+Forest.area);
		System.out.println("Forest Type :"+Forest.Type);
		System.out.println("Forest Region :"+Forest.Region);
		System.out.println(Forest.PrimaryAnimals);
			for (int row=0; row<Forest.PrimaryAnimals.length; row++)
			{
				String ref = Forest.PrimaryAnimals[row];
				System.out.println("Accessing element at row :"+row +" value :"+ref);
			}
		
		 Forest.Name= "Nallamala Forest";
		Forest.area = 24444;
		Forest.Type = "Southern Dry Mixed Deciduous Forest";
		Forest.Region = ("AndraPradesh");
		
		System.out.println("Forest Name :"+Forest.Name);
		System.out.println("forestArea :"+Forest.area);
		System.out.println("Forest Type :"+Forest.Type);
		System.out.println("Forest Region :"+Forest.Region);
		System.out.println(Forest.PrimaryAnimals);
		for (int index=0; index<Forest.PrimaryAnimals.length; index++)
			{
				String ref = Forest.PrimaryAnimals[index];
				System.out.println("Accessing element at index :"+index +" value :"+ref);
			}
		
}
}