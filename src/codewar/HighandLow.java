package codewar;

import java.util.Arrays;

public class HighandLow {
	public static String solution(String str) {
		String[] split = str.split(" ");
		int small = Integer.MAX_VALUE, high=Integer.MIN_VALUE;
		if(split.length==1) {
			return split[0]+" "+split[0];
		}
		else {
		for(String s : split) {
			if(Integer.valueOf(s)>high) {
				high=Integer.valueOf(s);
			}
			if(Integer.valueOf(s)<small) {
				small=Integer.valueOf(s);
			}
		}
		return Integer.toString(high)+" "+Integer.toString(small);
		}
		
//		int min = Arrays.stream(str.split(" "))
//                .mapToInt(i -> Integer.parseInt(i))
//                .min()
//                .getAsInt();
//
//		int max = Arrays.stream(str.split(" "))
//                .mapToInt(i -> Integer.parseInt(i))
//                .max()
//                .getAsInt();
//		
//		return String.format("%d %d", max, min);
	}
	public static void main(String[] args) {
		System.out.println(solution("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
		System.out.println(Integer.valueOf("-866"));
	}
}
