package com.coding.codality;

public class BinaryGap {

	public int gapLength(int number) {
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
		int maxGapLength = new BinaryGap().gapLength(1041);
		System.out.printf("Gap is %d", maxGapLength);
	}
}
