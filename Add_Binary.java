public class Add_Binary 
{
	static String add_Binary(String x, String y)
	{
		int num1 = Integer.parseInt(x, 2);
		int num2 = Integer.parseInt(y, 2);
		int sum = num1 + num2;
		String result = Integer.toBinaryString(sum);
		return result;
	}
	public static void main(String args[])
	{
		String x = "101", y = "11";

		System.out.print(add_Binary(x, y));
	}
}

Output : 1000