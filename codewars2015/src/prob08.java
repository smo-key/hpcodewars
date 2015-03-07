import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class prob08 {
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
		Scanner in = rf("prob08.txt");
		int cubes = in.nextInt();
		int nocubes = 0;
		int empty = 0;
		int count = 0;
		Hashtable<Integer, Integer> cubelist = new Hashtable<Integer, Integer>();
		for(int i = 0; i < cubes; i++) {
			cubelist.put(i, 0);
		}
		in.nextLine();
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			String name = line.split(" ")[0];
			int cube = Integer.parseInt(line.split(" ")[1]);
			if (name.trim().equals("NA")) { empty++; continue; }
			if (cube == 0) { nocubes++; continue; }
			count++;
			if (cubelist.containsKey(cube))
			{
				cubelist.put(cube,
						cubelist.
						get(cube)
						.intValue()
						+1);
			} else
			{
				cubelist.put(cube, 1);
			}
			
		}
		int numDuplicates = 0;
		for(int i = 0; i < cubelist.keySet().size(); i++) {
			if(cubelist.get(cubelist.keySet().toArray()[i]) > 1) {
				numDuplicates++;
			}
		}
		System.out.println("Empty Cubes: " + empty);
		System.out.println("Duplicate Cube Assignments: " + (numDuplicates));
		System.out.println("Employees without Cube: " + nocubes);
	}

}