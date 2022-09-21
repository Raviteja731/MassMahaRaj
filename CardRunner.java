class CardRunner{
	
	public static void main(String...Ra){
		
		Card.printDetails();
		
		Card.Type = "Metrocard";
		Card.height = 5;
		Card.width = 10;
		Card.price = 500;
		String[] ref = {"White","Black","Green","Blue"};
		Card.Colour = ref;
	}
}