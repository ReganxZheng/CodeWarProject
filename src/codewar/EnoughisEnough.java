package codewar;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class EnoughisEnough {
	public static int[] deleteNth(int[] elements, int max) {
		if(elements.length==0) {
			return new int[] {};
		}
		if(max<1) {
			return new int[] {};
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0;i<elements.length;i++) {
			if(map.containsKey(elements[i])) {
				int occur = map.get(elements[i]);
				if(occur < max) {
					occur++;
					map.put(elements[i], occur);
					temp.add(elements[i]);
				}
			}
			else {
				map.put(elements[i], 1);
				temp.add(elements[i]);
			}
		}
		int[] result = new int[temp.size()];
		for(int i=0;i<temp.size();i++) {
			result[i] = temp.get(i);
		}
		return result;
		
//		if (max < 1) return new int[0];
//	    
//	    final HashMap<Integer,Integer> map = new HashMap<>();
//	    final List<Integer> list = new ArrayList<>();
//	    
//	    for (final Integer i : elements) {
//	      final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
//	      if (v == null || v < max) list.add(i);
//	    }
//	    
//	    return list.stream().mapToInt(i->i).toArray();

 	}
	public static void main(String[] args) {
		int[] result = deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3);
		System.out.println(Arrays.toString(result));
 	}
}
