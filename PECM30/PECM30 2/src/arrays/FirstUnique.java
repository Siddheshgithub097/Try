package arrays;

public class FirstUnique 
{
	public static void main(String[] args) 
	{
		String a[]= {"hello","hi","hello","Hello","thanks","thanks","sorry"};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			if(a[i]!=null)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i].equals(a[j]))
					{
						count++;
						a[j]=null;
					}
				}
				if(count==0 && a[i]!=null)
				{
					System.out.println(a[i]);
					return;
				}
			}
		}
	}
}
