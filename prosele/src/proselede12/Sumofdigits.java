package proselede12;

public abstract class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=256;
		int rem=0;
		int sum=0;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;	
		}
	   System.out.println(sum);
		
		
		
		
		
	}

}
