package proselede;

import java.lang.reflect.Array;
import java.util.Arrays;
public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    	String a="Velocity";
    	char [] ch=a.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		System.out.print(ch[i] + ",");
    	}
    	
    	
    	String s="devdatt";
		char[] cha=s.toCharArray();
		for (char c : cha) {
			System.out.print(c+" ,");
		}
		
		
		
		
	}

}
