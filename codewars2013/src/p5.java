import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = r.rf("prob05.txt");
		while(true)
		{
			int n = in.nextInt();
			if (n == -1) { return; }
			if (n < 0) { continue; }
			ArrayList<Integer> l = new ArrayList<Integer>();
			l.add(0);
			l.add(1);
			l.add(1);
			for (int i=3; i<=n; i++)
			{
				l.add(l.get(i-2) + l.get(i-1) + l.get(i-3));
			}
			r.pl(l.get(n));
		}
	}

}
