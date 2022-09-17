class TrimmerRunner{
	public static void main(String...beard){
		
		System.out.println("Brand :"+Trimmer.Brand);
		System.out.println("Colour :"+Trimmer.Colour);
		System.out.println("price :"+Trimmer.price);
		System.out.println("warrenty :"+Trimmer.warranty);
		System.out.println("total Setting :"+Trimmer.totalSettings);
		for(int row=0; row<Trimmer.totalSettings.length; row++)
		{
			int ref = Trimmer.totalSettings[row];
			System.out.println(ref);
		}
		
		Trimmer.Brand = "HP";
		Trimmer.Colour = "White";
		Trimmer.price = 600;
		Trimmer.warranty = 4;
		
		
		System.out.println("Brand :"+Trimmer.Brand);
		System.out.println("Colour :"+Trimmer.Colour);
		System.out.println("price :"+Trimmer.price);
		System.out.println("warrenty :"+Trimmer.warranty);
	}
}