// import java.util.Random for getRandom
import java.util.Random;

class MathWork
{
	static int[] arr = new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
	
	public static void main(String[] args) 
	{
		

		divisible(1);


		System.out.println("Random number " + getRandom());

		
		printNumber(10);

	}


	public static void divisible(int nums)
	{
		nums = 100;
		for(int i = 0; i<=nums; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

	// 3.d and 3.e: 
	public static int getRandom()
	{
		return arr[new Random().nextInt(arr.length)];
	}


	public static int printNumber(int n)
	{
		if(n<0) return -1;
		System.out.println("num: " + n);
		return printNumber(n-1);
		
	}
}



/* else if(n<0)
			{
				!System.out.println("num: " + n);
			}


			if(n>=0)
			{
				System.out.println("num: " + n);
			} 


{
			if(n>=0)
			{
				System.out.println("num: " + n);
			}

		}




			**/