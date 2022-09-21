class Main
{
	public static void main(String[] args) 
	{
		printPartOfWord("Hallo", 1, 4);
	}

	static void printPartOfWord(String sentence, int index, int subset)
	{

		System.out.println(sentence.substring(index, subset));

	}
}