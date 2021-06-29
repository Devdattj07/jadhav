package tppackage;

public class Overloading {

	public void demo()
	{
		System.out.println("deva");
	}
	
	
	public void demo(int a)
	{
		System.out.println("jadhav");
	}
	
	
	public void demo(char $)
	{
		System.out.println("kanifnath");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overloading d=new Overloading();
		
		d.demo();
		d.demo(0);
		d.demo('f');
	}}







