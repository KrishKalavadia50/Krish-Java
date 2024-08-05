package module2_String.com;
/*Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters.*/
class Shake
{
	public void krish(int price,String name)
	{
		System.out.println("The price of the " + name + " krish is " + price);
	}
	public void krish(String name,int price)
	{
		System.out.println("The price of the " + name + " krish is " + price);
	}
}
public class Problem13 {
	public static void main(String[] args) {
		Shake s = new Shake();
		s.krish(500, "Chocolate");
		s.krish("ChocoBrownie",750);
	}
}
