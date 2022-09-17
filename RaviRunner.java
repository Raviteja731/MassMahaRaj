class RaviRunner{
	public static void main(String...Life){
		String Name = "RaviTeja";
		byte age = 23;
		String Gender = "Male";
		String Friends[] = new String[6];
		
		Friends[1] = "Somu";
		Friends[2] = "Shashi";
		Friends[3] = "Venkatesh";
		Friends[4] = "Prasad";
		Friends[5] = "Veeresh";
		Friends[6] = "Bhadra";
		System.out.println("Name :"+Name);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+Gender);
		System.out.println("Friends :"+Friends);
		for (int list=0; list<Friends.length; list++)
		{
			String ref = Friends[list];
			System.out.println(ref);
		}
			
		
	}
}