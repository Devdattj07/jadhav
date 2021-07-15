package proselede;

public class AddtionNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int	num=12345;
		int result=0;
	    int rem ;
		
		while(num>0)
		{
			rem=num%10;
			result=result+rem;
			num=num/10;	
		}
		System.out.println(result);
		
		
		
		
		
		
	}

}
