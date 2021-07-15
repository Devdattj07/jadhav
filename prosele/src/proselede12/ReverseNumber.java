package proselede12;

public class ReverseNumber {
	

	
	public static void main(String[] args) {
		
		
		
     	int number=123456;
    	int remainder;
        int result=0;
        
        while(number!=0)
        {
     remainder=number%10;
     result=result*10+remainder;
    
    number=number/10;
        }
    
    
    System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}