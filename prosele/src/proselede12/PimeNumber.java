package proselede12;

public class PimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=11;
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
		
		
	}

}
