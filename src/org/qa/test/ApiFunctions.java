package org.qa.test;

import java.io.InvalidObjectException;

public class ApiFunctions {
	//Reverse String
	public String reverseString(String str) {
		int len = str.length();
		String revStr = "";
		for (int i = len-1; i >=0 ; i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
	//Verify if the string  is a palindrome or not
	public boolean isPalindrome(String str) {
		String revStr = reverseString(str);
		if (revStr.compareTo(str)==0)
			return true;
		else
			return false;
	}
	//Verify if the string is a palindrome or not and Option to ignore case
	public boolean isPalindromeIgnoreCase(String str, boolean ignoreCase) {
		String revStr = reverseString(str);
		if (ignoreCase) {
			if (revStr.toLowerCase().compareTo(str.toLowerCase())==0)
				return true;
			else
				return false;
		}
		else {
			if (revStr.compareTo(str)==0)
				return true;
			else
				return false;
		}
		
	}
	//Verify if number is a palindrome
	public boolean isPalindrome(int num) {
		String strNum = String.valueOf(num);
		return isPalindrome(strNum);
	}
	//Reverse Words
	public String reverseWords(String sentence) {
		String revWords = "";
		String words [] = sentence.split(" ");
		for (int i=words.length-1; i>=0; i--) {
			revWords +=words[i] + " ";
		}
		return revWords;
	}
	
	public boolean isPrime(int num) throws InvalidObjectException {
		boolean isprime = true;
		if (num < 2)
			throw new InvalidObjectException("Invalid Input");
		for (int i=2; i < num; i++) {
			if (num % i == 0)
				isprime = false;
		}
		return isprime;
	}
	public void listNPrime(int num) throws InvalidObjectException {
		int i = 0;
		int number = 2;
		boolean flag = false;
		while (i < num) {
			while (!flag) {
				flag = isPrime(number);
				number++;
			}
			System.out.println(number-1);
			flag = false;
			i++;
		}
	}
	public void sortArray(int arr[]) {
		for (int i =0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i] < arr [j]) {
					int swap;
					swap = arr[j];
					arr[j]= arr[i];
					arr[i] = swap;
				}
			}
		}
		System.out.println();
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
