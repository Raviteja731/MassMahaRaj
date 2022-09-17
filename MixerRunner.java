class MixerRunner{
	public static void main(String...args){
		
	 String ref = Mixer.Brand;
	 String Colour = Mixer.Colour;
	 String Material = Mixer.Material;
	 short voltage = Mixer.voltage;
	 String Model = Mixer.Model;
	 char NoOfSpeed =Mixer.NoOfSpeed; 
	 int price = Mixer.price;
	 byte weightInKg = Mixer.weightInKg;
	 
		 System.out.println("Brand :"+ref);
		 System.out.println("voltage :"+voltage);
		 System.out.println("Colour :"+Colour);
		 System.out.println("weightInKg :"+weightInKg);
		 System.out.println("price :"+price);
		 System.out.println("Model :"+Model);
		 System.out.println("Material :"+Material);
		 System.out.println("NoOfSpeed :"+NoOfSpeed);
	}
}