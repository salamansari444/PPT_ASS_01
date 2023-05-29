package com.ineuron.main;

public class QP8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 2, 4 };
		int n = nums.length;
		int a = 0;

		int dup = 0;
		int miss = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					dup = nums[j];
					break;
				}
			}
		}

	
		int lenSum = 0;
		for (int i = 0; i <= n; i++) {
			lenSum = lenSum + i;
		}
		
		int numsSum = 0;
		for (int i = 0; i < n; i++) {
			numsSum = numsSum + nums[i];
		}
		int missFactor = numsSum - dup;
		miss = lenSum - missFactor;
	

		int res[] = new int[2];
		res[0] = dup;
		res[1] = miss;
		System.out.print("[ ");
		for (int i : res) {
			System.out.print(i+" ");
		}
		System.out.print("]");
	}

}
