package org.qa.test;

import java.lang.reflect.Array;
import java.util.Stack;

public class Sample1 {
	public String reverseString(String str) {
		String outStr = "";
		for (int i=str.length()-1; i>=0; i--) {
			outStr += str.charAt(i);
		}
		return outStr;
	}
	public String reverseWord(String str) {
		String [] strArr = str.split(" ");
		StringBuilder strBuff = new StringBuilder();
		for (int i = strArr.length-1; i >=0; i--) {
			strBuff.append(strArr[i]);
			strBuff.append(" ");
		}
		return strBuff.toString().trim();
	}
	public boolean isPrime(int digit) {
		for (int i=2; i<=digit/2; i++) {
			if (digit % i == 0)
				return false;
		}
		return true;
	}
	public int[] nPrime(int digit) {
		int[] primeArr = new int [digit];
		if (digit >= 1)
			primeArr[0] = 2;
		else
			return null;
		int i = 1;
		boolean flag = true;
		int j = 3;
		while ( i < digit) {
			while (flag) {
				if (isPrime(j)) {
					primeArr[i]=j;
					flag = false;
				}
				else {
					j++;
				}
			}
			flag = true;
			j++;
			i++;
		}
		return primeArr;
	}
	public boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public boolean isPalindrome(int num) {
		int rem = 0, num1 = num;
		int div = 0;
		int mul = 0;
		while (num1 > 0) {
			div = num1 % 10;
			num1 = num1 / 10;
			mul = mul * 10 + div; 
		}
		if (num==mul)
			return true;
		return false;
	}
	public boolean isBalancedString(String str){
		Stack<Character> sc = new Stack<>();
		Character chr;
		int flag = 0;
		for (Character c: str.toCharArray()) {
			if (c == '(' || c == '{' || c == '[' ) {
				sc.push(c);
			}
			else {
				if (sc.isEmpty())
					return false;
				chr = sc.pop();
				if ((c == ')' && chr == '(') || (c == '}' && chr == '{') ||(c == ']' && chr == '[')) {
					flag = 1;
				}
				else 
					return false;
			}
		}
		if (flag ==1 && sc.size() == 0) {
			return true;
		}
		return false;
	}
	public int[] sortArray(int[] numArr) {
		int swap;
		for (int i = 0; i < numArr.length; i++) {
			
			for (int j=i+1; j< numArr.length; j++) {
				if (numArr[i] > numArr[j]) {
					swap = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = swap;
				}
			}
			
		}
		
		return numArr;
	}
	public int sumofArray(int[] numArr) {
		int sum = 0;
		for (Integer i: numArr)
			sum+= i;
		return sum;
	}
	public int[] twoSum(int[] numArr, int result) {
		int[] resultArr = new int[2];
		for (int i=0; i < numArr.length; i++) {
			for (int j=i+1; j < numArr.length; j++) {
				if ((numArr[i] + numArr[j]) == result) {
					resultArr[0]=i;
					resultArr[1]=j;
				}
			}
		}
		return resultArr;
	}
	public void fizzbuzz() {
		for (int i=1; i<=100; i++) {
			if (i% 3 ==0 && i%5 == 0)
				System.out.println("Fizz Buzz, ");
			else if (i%3 == 0)
				System.out.println("Fizz, ");
			else if (i%5 == 0)
				System.out.println("Buzz, ");
			else 
				System.out.println(i + ", ");
				
		}
	}
}
