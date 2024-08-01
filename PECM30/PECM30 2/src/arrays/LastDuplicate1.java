package arrays;

public class LastDuplicate1 
{
	public static void main(String[] args) 
	{
		String a[]= {"hi","hello","hello","harry","kevin","speed","Avengers","tom","tom","Tom"};
		for(int i=a.length-1;i>0;i--)
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
				if(count!=0)
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
