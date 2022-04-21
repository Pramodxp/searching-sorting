package com.pramod.sort;

/**
 * @author pramodr
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		sort(new int[] { 10, 20, 1, 5, 9, 4, 3 });
	}

	static void sort(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}

		}
		System.out.println(nums);
	}

}
