package codewar;

public class vowelCount {
	public static int getCount(String str) {
//		int vowelsCount = 0;
//		char[] strArr = str.toCharArray();
//		for(char c : strArr) {
//			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//				vowelsCount++;
//			}
//		}
//		return vowelsCount;
		return str.replaceAll("(?i)[^aeiou]", "").length();
		}
	public static void main(String[] args) {
		System.out.println(getCount("abracadabra"));
	}
}
