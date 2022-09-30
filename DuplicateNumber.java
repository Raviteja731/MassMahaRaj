/*Diffrence B/w 
				primitive    													non primitive
			* it is pre-defined.												* it is not pre-defined.
			* it contains datatype 												* it contains Array &String
			* words starts with lower case 										* words starts with upper case
 			* size depends on datatype												* size are same
			*primitive has values 														* non primative doesnt have values 
			
			
	platform independece : which do not depends on others jvm is platform independece, byte  code is platform independece jre is platform dependece on jvm.
	
	class : which consist two members (States &  Matter).
	Example: chair (States: material, rod,caps,stickers ,etc)
				(Matter: sit,stand, sleep,throw,etc) 			
      main method : the program starts excugution from main method. 1st the mata space ill load the class & next the data is stored in the constant pool 
					next inn stack memory program starts excugution when excugution starts main will creats another fram upon the main the data is recived from the constant pool 
					and it sent to mainframe from mainframe it prints on console.*/
				
		
class DuplicateNumber{
	
	public static void main(String...Ra){
		
       int[] values={34,78,90,53,34,11,53,34,15,78,91,8,4,67,11};
	   System.out.println("Total values :"+values);
	   values[4]=20;
	   values[5]=31;
	   values[6]=43;
	   values[7]=96;
	   values[14]=1;
	   
	   for(int price=0;price<values.length;price++)
	   {
		   int index=price;
		   int ref= values[price];
		   System.out.println("values :"+ref);
		}
	
	}
}
				
	
	