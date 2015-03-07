public class Timer {
	public static void main(String[] args) throws Exception {
		int a = 10;
		if(args.length != 0) {
			a = Integer.parseInt(args[0]);
		}
		int inSeconds = a*60;
		for(int i = 0; i < inSeconds; i++) {
			System.out.println(formatSeconds(i) + " seconds elapsed, " + formatSeconds(inSeconds - i) + " remaining");
			Thread.sleep(1000);
		}
	}
	public static String formatSeconds(int seconds) {
		int minutes = seconds/60;
		int sec = seconds%60;
		String sString = String.valueOf(sec);
		if(sString.length() == 1) {
			sString = "0" + sString;
		}
		return minutes + ":" + sString;
	}
}
