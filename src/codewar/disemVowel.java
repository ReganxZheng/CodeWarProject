package codewar;

public class disemVowel {
	public static String disemvowel(String str) {
//		char[] strArr = str.toCharArray();
//		String result = "";
//		for(char c : strArr) {
//			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U') {
//				result+=c;
//			}
//		}
//		return result;
		
		//best practice
		return str.replaceAll("(?i)[aeiou]", "");
	}
	public static void main(String[] args) {
		System.out.println(disemvowel("This website is for losers LOL"));
	}
}
