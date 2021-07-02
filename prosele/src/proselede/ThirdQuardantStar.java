package proselede;

public class ThirdQuardantStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a=1;a<=5;a++)
		{
			for(int b=2;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int c=4;c>=a;c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
