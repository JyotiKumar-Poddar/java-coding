package com.coding.codality;

//https://app.codility.com/demo/results/trainingA22TK5-DM9/


public class BinaryGap {

	public int gapLength(int number) {
		System.out.printf("Binary string %s\n", Integer.toBinaryString(number));

		int gap = 0;
		int maxGap = 0;
		String binaryString = Integer.toBinaryString(number);
		System.out.printf("Number in binary format %s\n", binaryString);
		for (Character c : binaryString.toCharArray()) {
			if (c == '0') {
				gap++;
			} else {
				if (maxGap < gap) {
					maxGap = gap;
				}
				gap = 0;
			}
		}
		return maxGap;
	}

	public static void main(String[] args) {
		int maxGapLength = new BinaryGap().gapLength(20);  // 1041, 32
		System.out.printf("Gap is %d", maxGapLength);
	}
}
