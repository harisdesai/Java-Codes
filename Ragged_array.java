package com.array;

public class Ragged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int [4][4];
		arr[0] = new int[] {2};
		arr[1] = new int[] {6,5};
		arr[2] = new int[] {5,7,4};
		arr[3] = new int[] {9,3,8,1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println("");
		
		}

	}

}