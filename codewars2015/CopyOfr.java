

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CopyOfr {
	public static final void pl(String a) {
		System.out.println(a);
	}
	public static final void pl(int a) {
		System.out.println(a);
	}
	public static final void pl(double a) {
		System.out.println(a);
	}
	public static final void pl(float a) {
		System.out.println(a);
	}
	public static final void pl(long a) {
		System.out.println(a);
	}
	public static final void pl(short a) {
		System.out.println(a);
	}
	public static final void pl(boolean a) {
		System.out.println(a);
	}
	public static final void pl(int[] a) {
		System.out.println(java.util.Arrays.toString(a));
	}
	public static final void pl(String[] a) {
		System.out.println(java.util.Arrays.toString(a));
	}
	public static final void pl(double[] a) {
		System.out.println(java.util.Arrays.toString(a));
	}
	public static final void pl(float[] a) {
		System.out.println(java.util.Arrays.toString(a));
	}
	public static final void pl(long[] a) {
		System.out.println(java.util.Arrays.toString(a));
	}
	public static final void pl(boolean[] a) {
		System.out.println(java.util.Arrays.toString(a));
	}
	public static final void pl(short[] a) {
		System.out.println(java.util.Arrays.toString(a));
	}
	public static final void p(String a) {
		System.out.print(a);
	}
	public static final void p(int a) {
		System.out.print(a);
	}
	public static final void p(double a) {
		System.out.print(a);
	}
	public static final void p(float a) {
		System.out.print(a);
	}
	public static final void p(long a) {
		System.out.print(a);
	}
	public static final void p(short a) {
		System.out.print(a);
	}
	public static final void p(boolean a) {
		System.out.print(a);
	}
	public static final void p(int[] a) {
		System.out.print(java.util.Arrays.toString(a));
	}
	public static final void p(String[] a) {
		System.out.print(java.util.Arrays.toString(a));
	}
	public static final void p(double[] a) {
		System.out.print(java.util.Arrays.toString(a));
	}
	public static final void p(float[] a) {
		System.out.print(java.util.Arrays.toString(a));
	}
	public static final void p(long[] a) {
		System.out.print(java.util.Arrays.toString(a));
	}
	public static final void p(boolean[] a) {
		System.out.print(java.util.Arrays.toString(a));
	}
	public static final void p(short[] a) {
		System.out.print(java.util.Arrays.toString(a));
	}
	public static final void pn() {
		System.out.print("\n");
	}
	public static final Scanner rf(String filename) {
		try {
			return new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static final boolean hnl(Scanner s) {
		return s.hasNextLine();
	}
	public static final String nl(Scanner s) {
		return s.nextLine();
	}
	public static final String rl(Scanner s) {
		return s.nextLine();
	}
	public static final boolean hni(Scanner s) {
		return s.hasNextInt();
	}
	public static final int ni(Scanner s) {
		return s.nextInt();
	}
	public static final int ri(Scanner s) {
		return s.nextInt();
	}
	public static final void pround(double n, int digits) {
		System.out.printf("%." + digits + "f\n", n);
	}
	public static final double round(double n, int digits) {
		return Double.parseDouble(String.format("%." + digits + "f", n));
	}
	public static final Matcher regex(String pattern, String text)
	{
		return regex(pattern, text, false, false);
	}
	public static final Matcher regex(String pattern, String text, boolean caseinsensitive)
	{
		return regex(pattern, text, caseinsensitive, false);
	}
	public static final Matcher regex(String pattern, String text, boolean caseinsensitive, boolean multiline)
	{
		int flags = (caseinsensitive ? Pattern.CASE_INSENSITIVE : 0) + (caseinsensitive ? Pattern.MULTILINE : 0);
		Pattern p = Pattern.compile(pattern, flags);
		Matcher m = p.matcher(text);
		return m;
	}
}
