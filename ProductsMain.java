class ProductsMain{
	public static void main(String...Prices){
		String[] ProductPrice={"Otts","RuchiGold","ClinicPlus"};
		 System.out.println("total ProductPrice :" +ProductPrice);
		ProductPrice[1]="ragi";
		for(int product=0; product<ProductPrice.length; product++)
				{
					 int index= product;
					 String ref= ProductPrice[product];
					 System.out.println(ref);
				}
	}
}