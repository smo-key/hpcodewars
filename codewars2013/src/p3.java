import java.util.Scanner;


public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = r.rf("prob03.txt");
		while(in.hasNextLine())
		{
			String[] s = in.nextLine().split(" ");
			if (s[0].equals("END")) { break; }
			double d = Double.parseDouble(s[1]) * Double.parseDouble(s[3]);
			r.pl("On " + s[2] + ", " + s[0] + " would weigh " + d + " pounds.");
		}
	}

}