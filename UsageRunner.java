class  UsageRunner{
	 public static void main(String...usage){
		 
		 double google = 300;
		 double chrome = 500;
		 double instagram = 400;
		 double youTube = 300;											//Array Program
		 double playStore = 200;
		 
		 double[] interNetUsage={google,chrome,instagram,youTube,playStore};
		 double count=interNetUsage.length;
		 System.out.println("totalcount :"+count);
		
		double ref0=interNetUsage[0];
		double ref1=interNetUsage[1];
		double ref2=interNetUsage[2];
		double ref3=interNetUsage[3];
		double ref4=interNetUsage[4];
		System.out.println("at index ref 0 :"+ref0);
		System.out.println("at index ref 1 :"+ref1);
		System.out.println("at index ref 2 :"+ref2);
		System.out.println("at index ref 3 :"+ref3);
		System.out.println("at index ref 4 :"+ref4);
	 }
}