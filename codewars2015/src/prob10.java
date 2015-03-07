import java.util.Hashtable;
import java.util.Scanner;

public class prob10 {
	public static final java.util.Scanner rf(String filename) {
		try {
			return new java.util.Scanner(new java.io.File(filename));
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static final void pround(double n, int digits) {
		System.out.printf("%." + digits + "f\n", n);
	}
	public static final double round(double n, int digits) {
		return Double.parseDouble(String.format("%." + digits + "f", n));
	}
	public static final java.util.regex.Matcher regex(String pattern, String text)
	{
		return regex(pattern, text, false, false);
	}
	public static final java.util.regex.Matcher regex(String pattern, String text, boolean caseinsensitive)
	{
		return regex(pattern, text, caseinsensitive, false);
	}
	public static final java.util.regex.Matcher regex(String pattern, String text, boolean caseinsensitive, boolean multiline)
	{
		int flags = (caseinsensitive ? java.util.regex.Pattern.CASE_INSENSITIVE : 0) + (multiline ? java.util.regex.Pattern.MULTILINE : 0);
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(pattern, flags);
		java.util.regex.Matcher m = p.matcher(text);
		return m;
	}
	
	

	public static void main(String[] args) {
		Scanner in = rf("prob10.txt");
		Hashtable<String, Character> ht = new Hashtable<String, Character>();
		ht.put("40", ' ');
		ht.put("4B", '.');
		ht.put("6B", ',');
		ht.put("5A", '!');
		for(int a=0; a<9; a++)
		{
			ht.put("8" + (a+1), (char)('a' + a));
		}
		for(int a=0; a<9; a++)
		{
			ht.put("9" + (a+1), (char)('j' + a));
		}
		for(int a=0; a<8; a++)
		{
			ht.put("A" + (a+2), (char)('s' + a));
		}
		for(int a=0; a<9; a++)
		{
			ht.put("C" + (a+1), (char)('A' + a));
		}
		for(int a=0; a<9; a++)
		{
			ht.put("D" + (a+1), (char)('J' + a));
		}
		for(int a=0; a<8; a++)
		{
			ht.put("E" + (a+2), (char)('S' + a));
		}		
		
		int count = in.nextInt();
		for(int i=0; i<count; i++)
		{
			int c = in.nextInt();
			String s = "";
			for (int cn = 0; cn < c; cn++)
			{
				s += ht.get(in.next());
			}
			System.out.println(s);
		}
		
	}

}