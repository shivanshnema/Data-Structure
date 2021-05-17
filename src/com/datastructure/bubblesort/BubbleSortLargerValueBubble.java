package com.datastructure.bubblesort;

public class BubbleSortLargerValueBubble {
	
	private static int[] unsortedArray = new int[] {20, 35, -15, 7, 55, 1};
	
	private static int unsortedArrayIndex = unsortedArray.length - 1;
	public static void main(String[] args) {
		
		bubbleSort();
		for(int i=0;i<unsortedArray.length;i++) {
			System.out.print(unsortedArray[i]+" ");
		}
		
	}
	
	private static void bubbleSort() {
		int count = 1;
		for(int i = 1;i <= unsortedArrayIndex; i++) {
			if(unsortedArray[i] < unsortedArray[i-1]) {
				swap(i-1,i);
			}
			
			if(i == unsortedArrayIndex) {
				i = 0;
				System.out.print("For unSortedIndex "+(unsortedArrayIndex)+" : ");
				unsortedArrayIndex--;
				for(int j=0;j<unsortedArray.length;j++) {
					System.out.print(unsortedArray[j]+" ");
				}
				System.out.println();
			}
			count++;
		}
		System.out.println(count);
		
		
	}
	
	private static void swap(int prev, int next ) {
		int temp = unsortedArray[prev];
		unsortedArray[prev] = unsortedArray[next];
		unsortedArray[next] = temp;
	}

}
