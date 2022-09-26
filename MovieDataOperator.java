class MovieDataOperator{
	
	static String[] MovieData={null,null,null,null,null,null};
	
	static int position=0;
	static void save(String names)
	{
	 MovieData[position]=names;
		position++;
	}
	static void displayDetails()
	{
		for(int index=0;index<MovieData.length;index++)
		{
			String ref = MovieData[index];
			System.out.println("Movie Names :"+ref);
		}
	}
}