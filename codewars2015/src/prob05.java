import java.util.Scanner;

public class prob05 {
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
		Scanner in = rf("prob05.txt");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println(a + " x (" + b + " + " + c + ") = " + a + " x " + b + " + " + a + " x " + c);
		System.out.println(a + " x " + (b+c) + " = " + (a*b) + " + " + (a*c));
		System.out.println(a*(b+c) + " = " + (a*(b+c)));
	}

}