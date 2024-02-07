package org.qa.test;

import java.io.InvalidObjectException;

public class InterviewSamples {

	public static void main(String[] args) throws InvalidObjectException {
		// TODO Auto-generated method stub
		String revstr = "This";
		String balancedStr = "{([[]]({}}()[()]";
		String strPalindrome = "This is asdffdsa si sihT";
		int numPalindrome = 33;
		String revWord = "This is apple juice";
		int digit = 23;
		int []numArr = {9,5,2,8,11,0,-14,7,12,10,11,1};
		ApiFunctions api = new ApiFunctions();
		Sample1 s = new Sample1();
		System.out.println(api.reverseString("This string is crazy"));
		System.out.println(api.isPalindrome(strPalindrome));
		System.out.println(api.isPalindromeIgnoreCase(strPalindrome,true));
		System.out.println(api.isPalindromeIgnoreCase(strPalindrome,false));
		System.out.println(api.reverseWords(revWord));
		System.out.println(api.isPalindrome(345543));
		System.out.println("Prime");
		System.out.println(api.isPrime(5));
		System.out.println(api.isPrime(4));
		System.out.println(api.isPrime(2));
		System.out.println("============List Prime========");
		api.listNPrime(5);
		api.sortArray(numArr);
		/*System.out.println("Reverse of " + revstr + " is: " + s.reverseString(revstr));
		System.out.println("Reverse of " + revWord + " is: " + s.reverseWord(revWord));
		System.out.println(digit + " is a Prime number: " + s.isPrime(digit));
		int []arr = s.nPrime(digit);
		System.out.println(digit + " Prime numbers are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(strPalindrome + " is a Palindrome: " + s.isPalindrome(strPalindrome));
		System.out.println(numPalindrome + " is a Palindrome: " + s.isPalindrome(numPalindrome));
		System.out.println(balancedStr + " is a Balanced String: " + s.isBalancedString(balancedStr));
		System.out.println("Sorted Array: ");
//		int [] sortedArray = s.sortArray(numArr);
//		for (int i = 0; i < sortedArray.length; i++) {
//			System.out.println(sortedArray[i]);
//		}
		System.out.println("Sum of Array: " + s.sumofArray(numArr));
		
		int [] resultArray = s.twoSum(numArr, 1);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
		s.fizzbuzz();*/
	}

}
