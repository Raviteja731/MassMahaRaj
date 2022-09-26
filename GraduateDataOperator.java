class GraduateDataOperator{
	
	static String[] GraduateData = {null,null,null,null,null,null};
	static int position = 0;
	static void save(String mech)
	{
		GraduateData[position]=mech;
		position++;
	}
	static void displayDetails()
	{
		for(int index=0;index<GraduateData.length;index++)
		{
			String ref = GraduateData[index];
			System.out.println("Name :"+ref);
			System.out.println("Collage Name :"+ref);
			System.out.println("Branch :"+ref);
			System.out.println("Location :"+ref);
			System.out.println("USN :"+ref);
			System.out.println("Passing Year :"+ref);
		}
	}
}