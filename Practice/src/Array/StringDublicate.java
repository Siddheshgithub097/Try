package Array;
import java.util.Scanner;
public class StringDublicate {

	public static void main(String[] args) 
	{
		String a []= {" sid " , " aakash " ," aashish ", " sid " ," hiii " , " helloo ", " how are you " ," bye " , " goodbye "};
		
		for (int i = 0; i < a.length; i++)
		{
			int count=0;
			
			
			if (a[i]!=null)
			{
				for (int j = i+1; j < a.length; j++) 
				{
					if (a[i]==a[j])
					{
						count++;
						a[j]=null;
					}
				}
				if (count!=0)
				{
					System.out.println(a[i]);
				}
			}

	}

}
}
