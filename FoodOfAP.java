class FoodOfAP{
	public static void main(String...Items){
		String item1 = "Pulihora";
		String item2 = "ChepaPulusu";
		String item3 = "Pesarattu";
		String item4 = "ChickenBiryani";
		String item5 = "Dosa";
		String item6 = "CurdRice";
		String item7 = "Bobbatlu";
		String item8 = "MeduVada";
		String item9 = "MuddaPappu";
		String item10 = "Boorelu";
		String item11 = "PoothaRekulu";
		String item12 = "LemonRice";
		String item13 = "HyderabadiBiryani";
		
		String[] items= {"Pulihora","ChepaPulusu","Pesarattu","ChickenBiryani","Dosa","CurdRice","Bobbatlu","MuddaPappu","Boorelu","PoothaRekulu","LemonRice","HyderabadiBiryani"};
				 System.out.println("total no of Fooditems :"+items);
				 for(int foodOfAP=0; foodOfAP<items.length; foodOfAP++)
				 {
					 String ref =items[foodOfAP];
					 System.out.println(ref);
				 }
				 items[3]= "GeeRice";
				 items[7]= "Gobbi";
				 for(int foodOfAP=0; foodOfAP<items.length; foodOfAP++)
				 {
					 int index= foodOfAP;
					 String ref= items[foodOfAP];
					 System.out.println(ref);
				 }

	}
}