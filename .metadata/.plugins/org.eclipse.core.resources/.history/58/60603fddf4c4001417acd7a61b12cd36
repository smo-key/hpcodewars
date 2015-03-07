import java.util.Scanner;

public class prob19 {
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
	
	
	static final char[][] battleship = {
		{'X'},
		{'X'},
		{'X'},
		{'X'}
	};
	static final char[][] carrier = {
		{'-', '-', 'X'},
		{'-', 'X', 'X'},
		{'X', 'X', '-'},
		{'X', '-', '-'}
	};
	static final char[][] destroyer = {
		{'X', '-', 'X'},
		{'X', '-', 'X'},
		{'X', 'X', 'X'},
		{'X', 'X', 'X'}
	};
	static final char[][] frigate = {
		{'-', 'X', '-'},
		{'X', 'X', 'X'},
		{'X', 'X', 'X'},
		{'-', 'X', '-'}
	};
	static final char[][] gunner = {
		{'X', 'X'},
		{'X', 'X'},
		{'X', 'X'},
		{'X', 'X'}
	};
	public static void main(String[] args) {
		Scanner in = rf("prob19-1-in.txt");
		int size = in.nextInt();
		in.nextLine();
		char[][] grid = new char[size][size];
		for(int i = 0; i < size; i++) {
			grid[i] = in.nextLine().toCharArray();
		}
		char[][] currentShip = carrier;
		int numBattleships = 0;
		for(int i = 0; i < 4; i++) {
			numBattleships+=numTimesInArr(grid, currentShip, false);
			currentShip = rotateArr(currentShip);
		}
		System.out.println(numBattleships + " Carrier");
		currentShip = destroyer;
		numBattleships = 0;
		for(int i = 0; i < 4; i++) {
			numBattleships+=numTimesInArr(grid, currentShip, false);
			currentShip = rotateArr(currentShip);
		}
		System.out.println(numBattleships + " Destroyer");
		currentShip = frigate;
		numBattleships = 0;
		for(int i = 0; i < 4; i++) {
			numBattleships+=numTimesInArr(grid, currentShip, false);
			currentShip = rotateArr(currentShip);
		}
		System.out.println(numBattleships + " Frigate");
		currentShip = gunner;
		numBattleships = 0;
		for(int i = 0; i < 4; i++) {
			numBattleships+=numTimesInArr(grid, currentShip, false);
			currentShip = rotateArr(currentShip);
		}
		System.out.println(numBattleships + " Gunner");
		currentShip = battleship;
		numBattleships = 0;
		for(int i = 0; i < 4; i++) {
			numBattleships+=numTimesInArr(grid, currentShip, true);
			currentShip = rotateArr(currentShip);
		}
		System.out.println(numBattleships + " Battleship");
		
	}
	static char[][] rotateArr(char[][] a) {
		char[][] res = new char[a[0].length][a.length];
		for(int i =0; i < a[0].length; i++) {
			for(int o = 0; o < a.length; o++) {
				res[i][o] = a[o][i];
			}
		}
		return res;
	}
	static int numTimesInArr(char[][] a, char[][] grid, boolean battleship) {
		int count = 0;
		for(int i = 0; i < a.length - grid.length; i++) {
			for(int o = 0; o < a[i].length - grid[0].length; o++) {
				lab: {
					for(int p = 0; p < grid.length; p++) {
						for(int k = 0; k < grid[p].length; k++) {
							if(a[i][o] != grid[p][k] || (battleship && (o < a[i].length - 1 && a[i][o+1] != 'X'))) {
								break lab;
							}
						}
					}
					for(int p = 0; p < grid.length; p++) {
						for(int k = 0; k < grid[p].length; k++) {
							a[i+p][o+k] = '-';
						}
					}
					count++;
				}
			}
		}
		return count;
	}

}