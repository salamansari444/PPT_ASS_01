package com.ineuron.main;

/*Example :
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_] */

public class QP2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int res[] = new int[nums.length];
		int n = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				res[n] = nums[i];
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
