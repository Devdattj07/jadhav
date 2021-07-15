package proselede12;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aa="Devdatt";
		String bb="devdatt";
		String cc=" devdatt  jadhav  ";
		
		
		int size= aa.length();
		 System.out.println(size);
		 //==> 7
	/////////////////////////////////////
     // equals   true/false
		boolean x=aa.equals(bb);
		System.out.println(x);
	 //==>false
		
	/////////////////////////////////////	
	// equalsIgnore(same string but upper/lower char
		boolean s=aa.equalsIgnoreCase(bb);
		System.out.println(s);
	//==>true	
		
	/////////////////////////////////////////////	
   // startsWith     (starting char ) true/false
		System.out.println(aa.startsWith("Dev"));
	//==>true	
		
	///////////////////////////////////////
		
	// endsWith    (endsWith char) true/false
		System.out.println(aa.endsWith("att"));
	//==>true
		
  ///////////////////////////////////////////////////	
   //  charAt (find char by index in string)
		System.out.println(aa.charAt(0));
   //==>D
		
	//////////////////////////////////////////////////	
		
		//upend
		//after string add another string
		aa=aa+"class";
		System.out.println(aa);
				
	////////////////////////////////////////////////	
		
		//concat   tempory name change add last string
//	    aa=	aa.concat("clllasss");
//		System.out.println(aa);
//		//==>Devdattclassclllasss
//		
	////////////////////////////////////////////////
		
		// tolowercase  means make all char in lower
		
		System.out.println(aa.toLowerCase());
	//==>devdattclassclllasss
	////////////////////////////////////////////////////	
		
		//touppercase   make upper char
		System.out.println(aa.toUpperCase());
	//==>DEVDATTCLASSCLLLASSS
	////////////////////////////////////////////////////////
		
		//trim   remove starting and ending space
		System.out.println(cc.trim());
		
	///////////////////////////////////////////////////
		
		//replace  replce char j to d
		System.out.println(cc.replace('j','d'));
		
		////////////////////////////////////////////////
		
		//substring    3  and 4 ==> devdatt
		                        //  0123456
		                // 3-4         da
		
		System.out.println(aa.substring(3,5));
		                
		                     
		
	}

}
