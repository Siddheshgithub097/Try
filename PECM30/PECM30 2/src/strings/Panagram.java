package strings;

public class Panagram 
{
	public static void main(String[] args)
	{
		String s1="I am learning programs".toLowerCase();
		char []ch=s1.toCharArray();
		int count=0;
		for(int i='a';i<='z';i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(i==ch[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		if(count==26)
		{
			System.out.println("It is Pangram");
		}
		else
		{
			System.out.println("It is not Pangram");
		}
	}
}
