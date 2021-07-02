package tppackage;

public class Duplicatestring {

	
	
	public static void main(String[] args) {
		String a="devdatt";
		//shtring into character array
		char[] ch=a.toCharArray();
		
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
				}
				
			}
		}

	    }}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		