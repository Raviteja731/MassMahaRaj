class RaviTeja{
	
	static String Name;
	static String SonName;
	static String[] Awards;
	static byte[] hits;
	static short[] flops;
	static int[] average; 
	static String Colour;
	static byte[] multiStar;
	static byte[] upcoming;
	static double height;
	static byte[] nosOfVehicals;
	static boolean Alive;
	static byte[] noOflanguActed;
	static byte[] familyMembers;
	static int[] noOfMovies;
	static String[] FavHeroNames;
	static byte[] noOfFriends;
	
	static void PrintDetails()
	{
		System.out.println(Name);
		System.out.println(SonName);
		System.out.println(Colour);
		System.out.println(height);
		System.out.println(Alive);
		if(hits!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass=0; Mass<hits.length; Mass++)
			{
				byte ref = hits[Mass];
				System.out.println(ref);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(Awards!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass1=0; Mass1<Awards.length; Mass1++)
			{
				String ref1 = Awards[Mass1];
				System.out.println(ref1);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(flops!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass2=0; Mass2<flops.length; Mass2++)
			{
				short ref2 = flops[Mass2];
				System.out.println(ref2);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(average!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass3=0; Mass3<average.length; Mass3++)
			{
				int ref3 = average[Mass3];
				System.out.println(ref3);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(multiStar!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass4=0; Mass4<multiStar.length; Mass4++)
			{
				byte ref4 = multiStar[Mass4];
				System.out.println(ref4);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(upcoming!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass5=0; Mass5<upcoming.length; Mass5++)
			{
				byte ref5 = upcoming[Mass5];
				System.out.println(ref5);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(nosOfVehicals!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass6=0; Mass6<nosOfVehicals.length; Mass6++)
			{
				byte ref6 = nosOfVehicals[Mass6];
				System.out.println(ref6);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(noOfFriends!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass7=0; Mass7<noOfFriends.length; Mass7++)
			{
				byte ref7 = noOfFriends[Mass7];
				System.out.println(ref7);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(noOfMovies!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass8=0; Mass8<noOfMovies.length; Mass8++)
			{
				int ref8 = noOfMovies[Mass8];
				System.out.println(ref8);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(familyMembers!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass9=0; Mass9<familyMembers.length; Mass9++)
			{
				byte ref9 = familyMembers[Mass9];
				System.out.println(ref9);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(noOflanguActed!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass12=0; Mass12<noOflanguActed.length; Mass12++)
			{
				byte ref12 = noOflanguActed[Mass12];
				System.out.println(ref12);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
		if(FavHeroNames!=null)
		{
			System.out.println("pointing to memory");
			for(int Mass11=0; Mass11<FavHeroNames.length; Mass11++)
			{
				String ref11 = FavHeroNames[Mass11];
				System.out.println(ref11);
			}
		}
		else{
			System.out.println("Not pointing to memory");
		}
	}
}