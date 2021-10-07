package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// an interview question
public class SelectionSort {
	public static void main(String[] args) {

		// the objective here is to learn selection sort algorithm
		int[] arr = {55, 66, 78, 65, 908, 64, 1, 4, 5};
//		1st way of sorting is through the Collections
		ArrayList<Integer> arr1 = new ArrayList<>();
//		for (int i = 0; i < arr.length; i++) {
//			arr1.add(arr[i]);
//		}
		for (int k : arr) {
			arr1.add(k);
		}
		Collections.sort(arr1);
		System.out.println("arr1.toString() = " + arr1);
//		2nd way of sorting is through the Arrays
		Arrays.sort(arr);
		System.out.println("arr.toString() = " + Arrays.toString(arr));


		// first loop will keep the current smallest element
		for (int i = 0; i < arr.length; i++) {
			int smallestElement = arr[i];
			int smallestElementIndex = i;

			// second loop will iterate the rest of the array
			for (int j = i + 1; j < arr.length; j++) {
				if (smallestElement > arr[j]) {
					smallestElement = arr[j];
					smallestElementIndex = j;
				}
			}
			if (smallestElement != arr[i]) {
				int temp = arr[i];
				arr[i] = smallestElement;
				arr[smallestElementIndex] = temp;
			}

		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
