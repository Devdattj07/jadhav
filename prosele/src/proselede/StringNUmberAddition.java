package proselede;

public class StringNUmberAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="12345";
		int num=Integer.parseInt(a);
		int sum=0;
		
		System.out.println(num);
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}

