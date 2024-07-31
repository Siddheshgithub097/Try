package hashSet;

import java.util.HashSet;

public class HS1
{
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Pune");
		hs.add("Mumbai");
		hs.add("Chennai");
		hs.add("Delhi");
		hs.add("Bengaluru");
		hs.add("Pune");
		System.out.println(hs);
	}
}
