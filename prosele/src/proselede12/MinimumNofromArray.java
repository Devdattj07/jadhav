package proselede12;

public class MinimumNofromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,5,9,10,4};
		
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
		
		
		
		
		
		
		
	}

}
