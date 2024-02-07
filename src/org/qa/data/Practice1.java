package org.qa.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice1 {
	public void datastructure1(int[][] hm) {
		int k = 3;
		int row = hm.length;
		int column = hm[0].length;
		int[] arr = new int[row];
		int[] finalOP = new int [k];

		HashMap<Integer, Integer> out = new HashMap<>();
		System.out.println("The number of soldiers in each row is:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (hm[i][j] == 0) {
					arr[i] = j;
					
					System.out.println("- Row " + i + ": " + j);
					break;
				}
			}
		}
		System.out.println("Row flength " + row + " and Column length " + column);
		int min = 2147483647;
		int pos = -1;
		Set<Integer> s = new HashSet<>();

		for (int cnt = 0; cnt < k; cnt++) {
			for (int i = 0; i < row; i++) {
				if (min > arr[i] && !s.contains(i)) {
					min = arr[i];
					pos = i;
				}
			}
			s.add(pos);
			System.out.println(pos);
			finalOP[cnt] = pos;
			min = 2147483647;
			pos = -1;
		}
		
	}
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> s1 = new HashMap<>();
		Set arr = new HashSet<String>();
		int start = 0;
		int end = 0;
		for (int i=0; i<s.length(); i++) {
			if (!s1.containsKey(s.charAt(i))) {
				s1.put(s.charAt(i), 0);
			}
			else {
				end = i;
				arr.add(s.substring(start, end));
				start = i;
			}
			if (i==s.length()-1 && end !=i) {
				end = i;
				arr.add(s.substring(start, end+1));
			}
		}
		int max = 0;
		for (Object o: arr) {
			if (max < o.toString().length()) {
				max = o.toString().length();
			}
		}
		if (s.length() > 0 && max == 0)
			max = s.length();
		return max;
    }
}
