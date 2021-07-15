package proselede12;

public class Arrayofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringArray []= {"Hello","are","welcome"};
		StringBuffer abc=new StringBuffer();
		
		for(int i=0;i<stringArray.length;i++)
		{
			abc.append(stringArray[i]);
			
		}
		 String xyz=abc.toString();
		 System.out.println(xyz);
		
		
		
		

	}

}

