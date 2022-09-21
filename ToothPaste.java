class ToothPaste{
	
	static String Name;
	static String Colour;
	static int price;
	static byte weight;
	static int ManufYear;
	static short expYear;
	static short barCode;
	static int length;
	static boolean capThreaded;
	static byte quantity;
	static String Brand;
	static String flavor;
	static String ManufCountry;
	static String UsedBy;
	static char size;
	
	
	  static void setName(String value)
	  {
		  Name=value;
	  }	  
	  static void setColour(String value)
	  {
		  Colour=value;
	  }
	  static void setPrice(int value)
	  {
		  price=value;
	  }
	  static void setWeight(byte value)
	  {
		  weight=value;
	  }
	  static void setManufYear(int value)
	  {
		  ManufYear=value;
	  }
	  static void setExpYear(short value)
	  {
		  expYear=value;
	  }
	  static void setBarCode(short value)
	  {
		  barCode=value;
	  }
	  static void setLength(int value)
	  {
		  length=value;
	  }
	  static void setCapThreaded(boolean value)
	  {
		  capThreaded=value;
	  }
	  static void setQuantity(byte value)
	  {
		  quantity=value;
	  }
	  static void setBrand(String value)
	  {
		  Brand=value;
	  }
	  static void setFlavor(String value)
	  {
		  flavor=value;
	  }
	  static void setManufCountry(String value)
	  {
		  ManufCountry=value;
	  }
	  static void setUsedBy(String value)
	  {
		  UsedBy=value;
	  }
	  static void setSize(char value)
	  {
		  size=value;
	  }
	/*static void PrintDetails()
	{
		System.out.println(Name);
		System.out.println(Brand);
		System.out.println(price);
		System.out.println(size);
		System.out.println(UsedBy);
		System.out.println(ManufYear);
		System.out.println(weight);
		System.out.println(ManufCountry);
		System.out.println(expYear);
		System.out.println(barCode);
		System.out.println(quantity);
		System.out.println(length);
		System.out.println(flavor);
		System.out.println(capThreaded);
		System.out.println(Colour);
	}*/
	
	 static String getName()
	  {
		System.out.println("Name :"+Name);
			return Name;
	  }	  
	  static String getBrand()
	  {
		  System.out.println("Brand: "+Brand);
		  return Brand;
	  }
	  static int getPrice()
	  {
		  System.out.println("Price :"+price);
		  return price;
	  }
	  static byte getWeight()
	  {
		  System.out.println("Weight :"+weight);
		  return weight;
	  }
	  static int getManufYear()
	  {
		  System.out.println("ManufYear :"+ManufYear);
		  return ManufYear;
	  }
	  static short getExpYear()
	  {
		  System.out.println("ExpYear :"+expYear);
		 return expYear;
	  }
	  static short getBarCode()
	  {
		  System.out.println("BarCode :"+barCode);
		 return barCode;
	  }
	  static int getLength()
	  {
		  System.out.println("Length :"+length);
		  return length;
	  }
	  static boolean getCapThreaded()
	  {
		  System.out.println("CapThreaded :"+capThreaded);
		 return capThreaded;
	  }
	  static byte getquantity()
	  {
		  System.out.println("Quantity :"+quantity);
		 return quantity;
	  }
	  static String getColour()
	  {
		  System.out.println("Colour :"+Colour);
		 return Colour;
	  }
	  static String getFlavor()
	  {
		  System.out.println("Flavor :"+flavor);
		 return flavor;
	  }
	  static String getManufCountry()
	  {
		  System.out.println("ManufCountry :"+ManufCountry);
		  return ManufCountry;
	  }
	  static String getUsedBy()
	  {
		  System.out.println("UsedBy :"+UsedBy);
		  return UsedBy;
	  }
	  static char getSize()
	  {
		  System.out.println("Size :"+size);
		  return size;
	  }
}