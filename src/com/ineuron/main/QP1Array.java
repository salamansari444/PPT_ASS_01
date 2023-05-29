package com.ineuron.main;

public class QP1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, 2, 3 };
		int target = 6;
		int res[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					res[0] = i;
					res[1] = j;
				}
			}
		}
		System.out.print("[ ");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
			if (i < res.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

}
