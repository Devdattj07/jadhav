package tppackage;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="my name is Devdatt ";
		String result="";
		for(int i=s.length()-1;i>=0;i--)
		{
			result=result+s.charAt(i);
		}
		System.out.println(result);
		
		
	}

}




