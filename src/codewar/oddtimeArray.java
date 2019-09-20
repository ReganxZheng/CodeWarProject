package codewar;

import java.util.HashMap;
import java.util.Set;

public class oddtimeArray {
	public static int findIt(int[] a) {
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		int odd = 0;
//		for(int i : a) {
//			if(map.containsKey(i)) {
//				int occur = map.get(i);
//				occur++;
//				map.put(i, occur);
//			}
//			else {
//				map.put(i, 1);
//			}
//		}
//		
//		Set<Integer> keySet = map.keySet();
//		for(int currentKey : keySet) {
//			int occur = map.get(currentKey);
//			if(occur % 2 != 0) {
//				odd = currentKey;
//			}
//		}
//		return odd;
		int xor = 0;
		for(int i=0;i<a.length;i++) {
			xor ^= a[i];
		}
		return xor;
	}
	public static void main(String[] args) {
		System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
	}
}
