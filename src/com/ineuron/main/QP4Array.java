package com.ineuron.main;

public class QP4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,3 };
		int n = nums.length;

		for (int i = n - 1; i >= 0; i--) {
			if (nums[i] != 9) {
				nums[i]++;
				break;
			} else
				nums[i] = 0;
		}
		if (nums[0] == 0) {
			int res[] = new int[n + 1];
			res[0] = 1;
			for (int i : res) {
				System.out.print(i + " ");
			}
		} else {
			for (int i : nums) {
				System.out.print(i + " ");
			}

		}

	}

}
