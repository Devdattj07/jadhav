package proselede;

public class MinNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,5,6,9,100};
	    
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
