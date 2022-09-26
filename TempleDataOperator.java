class TempleDataOperator{
	
	static String[] templeName={null,null,null,null,null};
	static int workers[]={1,1,1,1,1};
	
		static int position = 0;
		static void save(String names,int staff)
	   {
	    templeName[position]=names;
		workers[position]=staff;
		position++ ;
	
	   }
	static void displayDetails()
	{
		for(int index=0;index<templeName.length;index++)
		{
			String ref=templeName[index];
			int ref1=workers[index];
				    System.out.println("names  :"+ref+"workers :"+ref1);

		}
	}
}
