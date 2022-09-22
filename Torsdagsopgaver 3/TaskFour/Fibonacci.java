class Fibonacci
{

	public static void main(String[] args) 
	{
		fibonacci(1,1);
	}


	public static void fibonacci(int num, int num2)
	{
		System.out.print(num + " \t ");
		if(num2<1000)
		{
			fibonacci(num2, num + num2);
		}

	}
}