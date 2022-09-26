class GraduateDataOperatorRunner{
	
	public static void main(String...Mech){
		
		GraduateDataOperator.displayDetails();
		
	System.out.println("Updated Details");
		GraduateDataOperator.save("Raviteja");
		GraduateDataOperator.save("Rymec");
		GraduateDataOperator.save("Royal Mechanical");
		GraduateDataOperator.save("Bellary");
		GraduateDataOperator.save("3VC18ME044");
		GraduateDataOperator.save("2022");
		
		GraduateDataOperator.displayDetails();
	}
}