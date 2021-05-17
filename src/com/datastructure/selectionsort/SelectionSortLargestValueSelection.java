package com.datastructure.selectionsort;

public class SelectionSortLargestValueSelection {
	
	private static int[] unsortedArray = new int[] { 20, 35, -15, 7, 55, 1 };
	
	private static int unsortedArrayIndex = unsortedArray.length - 1; 
	
	public static void main(String[] args) {
		
		selectionSort();
		for(int i = 0;i<unsortedArray.length;i++) {
			System.out.print(unsortedArray[i]+" ");
		}
	}
	
	private static void selectionSort() {
		
		int largest = 0;
		
		for(int i=1;i<=unsortedArrayIndex;i++) {
			if(unsortedArray[i] > unsortedArray[largest]) {
				largest = i;
			}
			
			if(i == unsortedArrayIndex) {
				swap(largest);
				largest = 0;
				i = 0;
				unsortedArrayIndex--;
				System.out.print("For unsortedArrayIndex "+(unsortedArrayIndex+1)+" : ");
				for(int j=0;j<unsortedArray.length;j++) {
					System.out.print(unsortedArray[j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	private static void swap(int largest) {
		int temp = unsortedArray[largest];
		unsortedArray[largest] = unsortedArray[unsortedArrayIndex];
		unsortedArray[unsortedArrayIndex] = temp;
	}
	

}
