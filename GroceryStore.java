class GroceryStore{
	
	static String StoreName;
	static String Location;
	static String Gstno;
	static String StoreType;
	static String Timing;
	static String Attendence;
	static byte branches;
	static byte noOfStaff;
	static byte entrys;
	static byte noOfFloors;
	static short height;
	static short width;
	static long constsBudget;
	static boolean onlinePay;
	
		static void setStoreName(String value)
		{
			StoreName=value;
		}
	    static void setLocation(String value)
		{
			Location=value;
		}
		static void setGSTNo(String value)
		{
				Gstno=value;
		}
		static void setStoreType(String value)
		{
			StoreType=value;
		}
		static void setTiming(String value)
		{
			Timing=value;
		}
		static void setAttendence(String value)
		{
			Attendence=value;
		}
		static void setBranches(byte value)
		{
			branches=value;
		}
		static void  setNoOfStaff(byte value)
		{
			noOfStaff=value;
		}
		static void setHeight(short value)
		{
			height=value;
		}
		static void setEntrys(byte value)
		{
			entrys=value;
		}
		static void setNoOfFloors(byte value)
		{
			noOfFloors=value;
		}
		static void setwidth(short value)
		{
			width=value;
		}
		static void setConstsBudget(long value)
		{
			constsBudget=value;
		}
		static void setOnlinePay(boolean value)
		{
			onlinePay=value;
		}
		
		static String getStoreName()
		{
			System.out.println("StoreName :"+StoreName);
			return StoreName;
		}
	    static String getLocation()
		{
			System.out.println("Location :"+Location);
			return Location;
		}
		static String getGSTNo()
		{
			System.out.println("Gstno :"+Gstno);
				return Gstno;
		}
		static String getStoreType()
		{
			System.out.println("StoreType :"+StoreType);
			return StoreType;
		}
		static String getTiming()
		{
			System.out.println("Timing :"+Timing);
			return Timing;
		}
		static String getAttendence()
		{
			System.out.println("Attendence :"+Attendence);
			return Attendence;
		}
		static byte getBranches()
		{
			System.out.println("branches :"+branches);
			return branches;
		}
		static byte getNoOfStaff()
		{
			System.out.println("noOfStaff :"+noOfStaff);
			return noOfStaff;
		}
		static short getHeight()
		{
			System.out.println("height :"+height);
			return height;
		}
		static byte getEntrys()
		{
			System.out.println("entrys :"+entrys);
			return entrys;
		}
		static byte getNoOfFloors()
		{
			System.out.println("noOfFloors :"+noOfFloors);
			return noOfFloors;
		}
		static short getwidth()
		{
			System.out.println("width :"+width);
			return width;
		}
		static long getConstsBudget()
		{
			System.out.println("constsBudget :"+constsBudget);
			return constsBudget;
		}
		static boolean getOnlinePay()
		{
			System.out.println("onlinePay "+onlinePay);
			return onlinePay;
		}
}
