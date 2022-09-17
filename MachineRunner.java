class MachineRunner{
	public static void main(String...wash){
		
		String ref = WashingMachine.Brand;
		byte weightInKg = WashingMachine.weightInKg;
		String Colour = WashingMachine.Colour;
		 short rPM =WashingMachine.rPM;
		 float lengthInCm = WashingMachine.lengthInCm;
		 String ControlType = WashingMachine.ControlType;
		 String Material = WashingMachine.Material;
		 boolean childLock = WashingMachine.childLock;
		 
		 System.out.println("Brand :"+ref);
		 System.out.println("weightInKg :"+weightInKg);
		 System.out.println("Colour :"+Colour);
		 System.out.println("rPM :"+rPM);
		 System.out.println("lengthInCm :"+lengthInCm);
		 System.out.println("ControlType :"+ControlType);
		 System.out.println("Material :"+Material);
		 System.out.println("childLock :"+childLock);

	}
}