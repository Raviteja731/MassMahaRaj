class Card {
	
	static String Type;
	static int height;
	static int width;
	static short price;
	static String[] colour;
	
	   static void printDetails();
	   {
		   System.out.println(Type);
		   System.out.println(height);
		   System.out.println(width);
		   System.out.println(price);
            for(int om=0;om<colour.length;om++)
			{
				String ref = colour[om];
				System.out.println(ref);
			}				
	   }
}