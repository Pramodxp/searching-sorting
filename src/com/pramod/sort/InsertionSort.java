package com.pramod.sort;

/**
 * @author pramodr
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int nums[] = new int[] { 80, 10, 60, 20, 5, 90 };
		sort(nums);
	}

	public static void sort(int nums[]) {
		int i = 0;
		int j = 0;
		int temp = nums[0];
		while (i < nums.length) {
			if (i != nums.length - 1 && nums[i] > nums[i + 1]) {
				temp = nums[i];
				nums[i] = nums[i + 1];
				nums[i + 1] = temp;
				j++;
			}
			i++;
			if (i == nums.length - 1) {
				if (j == 0) {
					return;
				}
				i = 0;
				j = 0;
			}
		}
	}

}
