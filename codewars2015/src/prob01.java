

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class prob01 {

	public static final Scanner rf(String filename) {
		try {
			return new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = rf("prob01.txt");
		while(s.hasNextLine()) {
			String a = s.nextLine().trim();
			System.out.println("Hello, " + a + "!  We love your t-shirt.");
		}
	}

}
