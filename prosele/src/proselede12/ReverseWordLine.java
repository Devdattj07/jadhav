package proselede12;

public class ReverseWordLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s="My name is devdatt";
         String result="";	

		String [] arr=s.split("\\s");
		for(int i=arr.length-1;i>=0;i--)
		{
			result=result+arr[i]+" ";
		}
		System.out.println(result);
		
		
		
	}

}
