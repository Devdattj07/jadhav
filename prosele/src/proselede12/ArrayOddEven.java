package proselede12;

import java.util.ArrayList;

public class ArrayOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int total1 = 0;
        int total2 = 0;
		int [] a= {10,20,25,14,44,40,30};
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			else
			{
				al2.add(a[i]);
			}
		}
		System.out.println("even number");
		for(int nu : al1)
		{
			total1=total1+nu;
			System.out.println(nu+" ");
			
		}
		System.out.println("sum of total even no "+total1);
		System.out.println("\n");
		System.out.println("total no of even:"+al1.size());
		
		System.out.println("odd number");
		for(int nu :al2)
		{
			total2=total2+nu;
			System.out.println(nu+" ");
		}
		System.out.println("sum no of odd :"+ total2);
		System.out.println("total no of even:"+al2.size());
     	}}
		
	


