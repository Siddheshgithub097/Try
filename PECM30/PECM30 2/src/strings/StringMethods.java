package strings;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s="Photosynthesis";
		System.out.println(s.charAt(4));
		System.out.println(s.concat(" happens in daylight"));
		System.out.println(s.contains("Photo"));
		System.out.println("Vignesh".endsWith("esh"));
		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf("synth",6));
		System.out.println("".isEmpty());
		System.out.println(s.lastIndexOf("synth"));
		System.out.println(s.length());
		System.out.println(s.replace('s','$'));
		System.out.println(s.replace("Photo","Video"));
		String []str=s.split("s");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println(s.startsWith("Pho"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,9));
		char []ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("Raju".trim());
	}
}
