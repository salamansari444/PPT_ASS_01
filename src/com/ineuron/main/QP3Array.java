package com.ineuron.main;

/*
Given a sorted array of distinct integers and a target value, 
return the index if the target is found. If not, return the index where 
it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5

Output: 2
*/

public class QP3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 3, 5, 6 };
		int val = 5;
		int res[] = new int[nums.length];
		int n = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				res[n] = i;
				n++;
			}
		}
//		System.out.println(n);

		System.out.print("[ ");
		for (int i = 0; i < n; i++) {
			System.out.print(res[i]);
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");

	}

}
