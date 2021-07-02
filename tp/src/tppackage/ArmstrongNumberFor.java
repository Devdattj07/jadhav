package tppackage;

public class ArmstrongNumberFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=153
				;
		int sum=0;
		int temp=num;
		for(int a=1;a<=3;a++)
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("Armstromg");
		}
		else
		{
			System.out.println("No arm");
		}
	}

}


