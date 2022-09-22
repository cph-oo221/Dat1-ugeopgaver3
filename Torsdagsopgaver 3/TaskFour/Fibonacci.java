class Fibonacci
{

	public static void main(String[] args) 
	{
		fibonacci(1,1);
	}


	public static void fibonacci(int num, int num2)
	{
		System.out.println(num + " \t " + num2);
		if(num2<1000)
		{
			fibonacci(num2, num + num2);
		}

	}
}