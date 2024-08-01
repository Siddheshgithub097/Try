package strings;

public class CharArrayClone 
{
	public static void main(String[] args) 
	{
		char []ans=StringtoCharArray("qsPiDer$");
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
	public static char[] StringtoCharArray(String s)
	{
		char []ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char ex=s.charAt(i);
			if(ex>='a' && ex<='z')
			{
				ch[i]=(char)(ex-32);
			}
			else
			{
				ch[i]=ex;
			}
		}
		return ch;
	}
}
