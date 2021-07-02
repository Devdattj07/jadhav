package proselede;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number=20;
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
			System.out.println("prime");
		}
		else
		{
			System.out.println("no prime number");
		}
	    }}
	











