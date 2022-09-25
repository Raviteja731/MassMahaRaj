class ProductItems{
	
	public static void main(String[] items){
		
		    String ProductName=items[0];
		    String productType=items[1];
		    String productPrice=items[2];
			String productQuantity=items[3];
			String productQuality=items[4];
					  System.out.println("Product Name :"+ProductName);
					  System.out.println("Product Type :"+productType);
					  System.out.println("Product Price :"+productPrice);
					  System.out.println("Product Quantity :"+productQuantity);
					  System.out.println("Product Quality :"+productQuality);
					
				   
				int convertedPrice=Integer.parseInt(productPrice);
				 System.out.println("Converted price: "+convertedPrice);
				 int convertedQuantity=Integer.parseInt(productQuantity);
				  System.out.println("Converted Quantity: "+convertedQuantity);
				  int convertedQuality=Integer.parseInt(productQuality);
				   System.out.println("Converted Quality: "+convertedQuality);
				     if(convertedPrice<100)
				   {
					   System.out.println("its ok");
				   }else
				   {
					   System.out.println("it is not worth");
				   }
	}
}