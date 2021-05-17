package com.datastructure.bubblesort;

public class BubbleSortSmallerValueBubble {
	
	private static int[] unsortedArray = new int[] {20, 35, -15, 7, 55, 1};
	
	private static int unsortedArrayIndex = 0;
	
	public static void main(String[] args) {
		
		bubbleSort();
		for(int i=0;i<unsortedArray.length;i++) {
			System.out.print(unsortedArray[i]+" ");
		}
	}
	private static void bubbleSort() {
		
		for(int i=unsortedArray.length-1;i>unsortedArrayIndex;i--) {
			
			if(unsortedArray[i] < unsortedArray[i-1]) {
				swap(i,i-1);
			}
			
			if(i == (unsortedArrayIndex+1)) {
				i = unsortedArray.length - 1;
				unsortedArrayIndex++;
				System.out.print("For unsortedArrayIndex "+ unsortedArrayIndex + " : ");
				for(int j=0;j<unsortedArray.length;j++) {
					System.out.print(unsortedArray[j]+" ");
				}
				System.out.println();
				
			}
		}
	}
	
	private static void swap(int next, int prev) {
		int temp = unsortedArray[next];
		unsortedArray[next] = unsortedArray[prev];
		unsortedArray[prev] = temp;
	}
}
