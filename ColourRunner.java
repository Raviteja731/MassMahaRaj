class ColourRunner{
	
	public static void main (String...ra){
		
	System.out.println("Updated colours");
		Colour.save("Pink");
		Colour.save("Blue");
		Colour.save("White");
		Colour.save("Green");
		Colour.save("Yellow");
		Colour.save("Black");
		Colour.save("Brown");
		
		Colour.displayDetails();
		
		boolean find=Colour.findcolour("Green");
		System.out.println("Enterd colour is found in array :"+find);

	}
}