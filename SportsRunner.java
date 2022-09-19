class SportsRunner{
	
	public static void main(String...Members)
	{
		String[] Names = {"Sachin","Dhoni","RohithSharama","Virat","Raina","Pollad","Raviteja","Drawid","Bhumra"};
		Sports.cricketTeamMembers(Names);
	
	   System.out.println("JerseyNos");
		int[] Numbers = {06,9,17,11,12,45,67,93,19};
		Sports.kabbadiTeamMembersJerseyNos(Numbers);
		
	  System.out.println("salarys");
		double[] Salarys = {120000,130000,140000,150000,160000,170000,180000,190000,200000};
		Sports.FootBallTeamMembersSalary(Salarys);
		
	   System.out.println("mobileNos");
		long[] MobileNos = {9876542137l,14645225784l,9647783425l,9622576364l,5842696535l,9146864268l,9846284594l,9638904623l,8165836459l};
		Sports.ludoTeamMobileNumber(MobileNos);
		
		System.out.println("nosOfMatches");
		int[] NosOfMatches = {2,4,5,6,7,8,9,1,3};
		Sports.hockeyTeamMemberNoOfMatches(NosOfMatches);
		
		System.out.println("countryCodes");
		long[] CountryCodes = {256785634656l,4987654l,5345678l,612345678l,734567l,887654312l,9123456l,123456l,3987678l};
		Sports.kokoTeamMembersCountryCodes(CountryCodes);
		
		System.out.println("membersAlive");
		boolean[] MembersAlive = {true,true,true,true,true,true,true,true,true};
		Sports.logoriTeamMembersAlive(MembersAlive);
	}
}