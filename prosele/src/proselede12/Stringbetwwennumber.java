package proselede12;

public class Stringbetwwennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a="abc123xy46sd";
		
		String c="";
		String d="";
		String e="";
		
		c=a.substring(3, 6);
		d=a.substring(8, 10);
		e=c+d;
		
		int f=Integer.parseInt(e);
		System.out.println(f);
		
		int n=f;
		int rem=0;
		int add=0;
		while(n!=0)
		{
			rem=n%10;
			add=add+rem;
			n=n/10;
		}
		System.out.println(add);
		
		
				
		
		
		
	}

}
