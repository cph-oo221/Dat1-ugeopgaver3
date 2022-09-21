// import java.util.Random for getRandom
import java.util.Random;

class MathWork
{

	
	public static void main(String[] args) 
	{
		

		divisible(1);


		System.out.println("Random number " + getRandom());

		//TODO
		printNumber(5);

	}


	static void divisible(int nums)
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
	static int getRandom()
	{
		int[] arr = new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
		return arr[new Random().nextInt(arr.length)];
	}

// TODO
	static void printNumber(int n)
	{
		for(int i=5; n<=0; i--);
		{
			if(n>=0)
			{
				System.out.println("num: " + n);
			} 
		}
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