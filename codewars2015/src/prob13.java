import java.util.ArrayList;
import java.util.Scanner;

public class prob13 {
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
	
	
	public static boolean isAlternating(String s) {
		if(s.length() == 0) return false;
		char[] chars = s.toCharArray();
		boolean alternates = true;
		char prev = chars[0];
		for(int i = 1; i < chars.length; i++) {
			if(chars[i] == prev) return false;
			prev = chars[i];
		}
		return alternates;
	}
	public static void main(String[] args) {
		Scanner in = rf("prob13-1-in.txt");
		String str = in.nextLine();
		int expected = in.nextInt();
		str = str.substring(0, str.length()-1);
		int strlen = str.length();
		int[] possibleValues = new int[strlen];
		for(int i = 0; i < strlen; i++) {
			for(int o = 1; o <= 6; o++) {
				possibleValues[i] = o;
			}
			
		}
		for(int i = 0; i < str.length(); i++) {
			int altNumber = -1;
			int altLength = -1;
			for(int o = i+1; o < str.length() && o < i + 7; o++) {
				String s = str.substring(i, o);
				if(!s.equals("")) {
					long l = Long.parseLong(s);
					String bin = Long.toBinaryString(l);
					if(isAlternating(bin)) {
						//System.out.println("B:" + bin);
						altNumber = (int)l;
						altLength = bin.length();
					}
				} else {
					break;
				}
			}
			if(altLength != -1) {
				System.out.println(altNumber);
				i+=altLength;
			}
		}
		/*String k = in.nextLine();
		String m = k.substring(0, k.length()-1);
		long a = Long.parseLong(m);
		String b = Long.toBinaryString(a);
		ArrayList<String> str = new ArrayList<String>();

		for (int i=0; i<b.length() - 1; i++)
		{
			if (b.substring(i, i+2).equals("00"))
			{
				str.add(b.substring(0, i+1));
				b = b.substring(i+1);
			}
			if (b.substring(i, i+2).equals("11"))
			{
				str.add(b.substring(0, i+1));
				b = b.substring(i+1);
			}
		}
		for(String i : str)
		{
			System.out.println(Integer.toString(Integer.parseInt(i, 2), 10));
		}*/
	}

}