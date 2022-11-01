package com.javaProgram.work;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {

	static void countChar(String word) {
		char[] charr = word.toCharArray();
		// char c = charr[0];

// 0 1 2 3 4 5 6 7
// e m i r a t e s
//		for (int i = 0; i < charr.length; i++) {
//			int occ = 1;
//			char c = charr[i];
//			for (int j = i + 1; j < charr.length; j++) {
//				if (c == charr[j]) {
//					occ = occ + 1;
//				}
//			}
//			System.out.println(c + " = " + occ);
//		}
		Map<Character, Integer> occurMap = new HashMap<>();
		for (int i = 0; i < charr.length; i++) {
			char c = charr[i];
			if (occurMap.containsKey(c)) {
				occurMap.put(c, occurMap.get(c) + 1);
			} else {
				occurMap.put(c, 1);
			}

		}
		System.out.println(occurMap);

	}

	public static void main(String[] args) {
		countChar("emiraitess");
	}

	// e = 2
	// m = 1
	// i = 1
	// r = 1
	// a = 1
	// t = 1
	// s = 2

}
