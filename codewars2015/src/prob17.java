import java.awt.Point;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class prob17 {
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
		Scanner in = rf("prob17-1-in.txt");
		//Point a = new Point(5, 10);
		Hashtable<Point, Character> points = new Hashtable<Point, Character>();
		char start = in.next().charAt(0);
		char end = in.next().charAt(0);
		char cur = '0';
		char go = end;
		int count = 1;
		Point p = new Point(0, 0);
		while(cur <= end)
		{
			points.put(p, cur);
			if (end == '-')
			{
				//go left thrice
				p.setLocation(p.x - 1, p.y);
				points.put(p, '-');
				p.setLocation(p.x - 1, p.y);
				points.put(p, '-');
				p.setLocation(p.x - 1, p.y);
				points.put(p, '-');
			}
			if (end == '/')
			{
				//go up right
				p.setLocation(p.x + 1, p.y + 1);
				points.put(p, '/');
			}
			if (end == '\\')
			{
				//go down right
				p.setLocation(p.x + 1, p.y - 1);
				points.put(p, '\\');
			}
			cur += 1;
			if (cur == '0' + 1) { cur = 'A'; }
		}
		//find max bounds
		int left = 0;
		int right = 0;
		int top = 0;
		int bottom = 0;
		
		for (int i=0; i<points.keySet().size(); i++)
		{
			Point po = (Point) points.keySet().toArray()[i];
			if (po.x > right) { right = po.x; }
			if (po.x < left) { left = po.x; }
			if (po.y < top) { top = po.y; }
			if (po.y > bottom) { bottom = po.y; }
		}
		
		for (int x =left; x<=right; x++)
		{
			for (int y=top; y<=bottom; y++)
			{
				
			}
		}
		
	}

}