package com.ineuron.main;

public class QP5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1,2,3,0,0,0 };
		int []nums2 = {2,5,6};
		int m=0;
		for(int i=0; i<nums1.length; i++) {
			if(nums1[i] !=0) {
				m++;
			}
		}
		System.out.println(m);
		int n=0;
		for(int i=0; i<nums2.length; i++) {
			if(nums2[i] !=0) {
				n++;
			}
		}
		System.out.println(n);
		
		int a=0;
		int b=0;
		
		for(int i=0; i<(m+n); i++) {
			if(a > (m-1)) {
				nums1[i]=nums2[b];
				b++;
			}
			
			else if(nums1[a] <= nums2[b]) {
				nums1[i]=nums1[a];
				a++;
			}
			else {
				nums1[i]=nums2[b];
				b++;
			}
		}
		System.out.print("[ ");
		for (int i : nums1) {
			System.out.print(i+" ");
			
		}
		System.out.print("]");
	}

}
