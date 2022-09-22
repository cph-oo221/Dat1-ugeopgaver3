class Palindrome
{	

	public static void main(String[] args) 
	{
		System.out.println("taskOne");
		printlfPalindrome("Mellem");
		System.out.println("taskTwo");
		printlfPalindrome("Den laks skal ned");
	}

	static void printlfPalindrome(String sentence)
	{
		
		String reverseSentence="";

		int sentenceLength = sentence.length();

		for(int i=(sentenceLength-1); i>=0; --i)
		{
			reverseSentence = reverseSentence + sentence.charAt(i);
		}

		if (sentence.toLowerCase().equals(reverseSentence.toLowerCase())) 
		{
			System.out.println(sentence);
		}

	}
}
