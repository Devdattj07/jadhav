package proselede12;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="devdatt";
		 String result ="";  //result string 
		int size=s.length(); // 7 character
		
		for(int i=size-1;i>=0;i--)
		{
		 result=result+s.charAt(i);
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		

	}

}
