package com.ineuron.main;

public class QP7Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 0, 1, 0, 3, 12 };
		int n = nums.length;
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				nums[a]=nums[i];
				a++;
			}
		}

		for (int i = a; i < n; i++) {
			nums[i]=0;
		}
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}

}
