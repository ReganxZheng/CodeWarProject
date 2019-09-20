package codewar;

public class readableTime {
	public static String makeReadable(int seconds) {
		String hours = seconds/3600 < 10 ? 
				"0"+Integer.toString(seconds/3600) : Integer.toString(seconds/3600);
		String mins = (seconds % 3600)/60 < 10 ? 
				"0"+Integer.toString((seconds % 3600)/60) : Integer.toString((seconds % 3600)/60);
		String sec = ((seconds % 3600) % 60) < 10 ? 
				"0"+Integer.toString((seconds%3600)%60) : Integer.toString((seconds%3600)%60);
				
		return hours+":"+mins+":"+sec;
//		return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
	}
	public static void main(String[] args) {
		System.out.println(makeReadable(61));
		
		
		
	}
}
