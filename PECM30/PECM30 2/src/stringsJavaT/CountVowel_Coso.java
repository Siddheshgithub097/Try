package stringsJavaT;

public class CountVowel_Coso 
{
	public static void main(String[] args) {
		 String str = "This is a really simple sentence";   
		 int Countvowel = 0;
		 int CountConso = 0 ;
		 
		 for (int i = 0; i < str.length(); i++) 
		 {
			 if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
					 {
				 		Countvowel++;
					 }
			 else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			 {
				 CountConso++;
			 }
		 }
		 
		 System.out.println(" total no of vowel is "+ Countvowel);
		 System.out.println(" total no of Conso is "+CountConso);
	}
}
