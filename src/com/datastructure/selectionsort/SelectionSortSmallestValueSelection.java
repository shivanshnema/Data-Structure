package com.datastructure.selectionsort;

public class SelectionSortSmallestValueSelection {

	private static int[] unsortedArray = new int[] { 20, -30, -15, 7, 55, 1 };

	private static int unsortedArrayIndex = 0;

	public static void main(String[] args) {
		
		selectionSort();
		for(int j=0;j<unsortedArray.length;j++) {
			System.out.print(unsortedArray[j]+" ");
		}
		System.out.println();

	}
	
	private static void selectionSort() {
		
		int smallest = unsortedArray.length - 1;
		
		for(int i = unsortedArray.length - 1;i >= unsortedArrayIndex;i--) {
			
			if(unsortedArray[smallest] > unsortedArray[i]) {
				smallest = i;
			}
			
			if(i == unsortedArrayIndex) {
				swap(smallest);
				unsortedArrayIndex++;
				smallest = unsortedArray.length - 1;
				i = unsortedArray.length - 1;
				for(int j=0;j<unsortedArray.length;j++) {
					System.out.print(unsortedArray[j]+" ");
				}
				System.out.println();
				
			}
		}
	}
	
	private static void swap(int smallest) {
		int temp = unsortedArray[smallest];
		unsortedArray[smallest] = unsortedArray[unsortedArrayIndex];
		unsortedArray[unsortedArrayIndex] = temp;
	}

}
