package tppackage;

public class PrimeNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int A[]= {1,3,5,3,7,6,8,9,2,1};	
		
		
		int num=0;
		int l=A.length;
		String primeNumbers="";
		
		for(int i=0;i<=l;i++)
		{
			int sum=0;
			for(num=i;num>=1;num--)
			{
				if(i %num==0)
				{
					sum=sum+1;
				}
			}
			if(sum==2)
			{
				primeNumbers = primeNumbers + i +" ";
			}
		}
		System.out.println(primeNumbers);
		
		
	}

}

