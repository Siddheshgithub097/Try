package ProgramingTask;

public class DuplicateCharacter 
{
	public static void main(String[] args) 
	{
		String s1="Assignment";
		char[]ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			if(ch[i]!='\u0000')
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						ch[j]='\u0000';
					}
				}
				if(count!=0)
				{
					System.out.println(ch[i]+" is duplicate character");
				}
			}
		}
	}
}
