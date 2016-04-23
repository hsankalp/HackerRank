package Implementation;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();

		}

		Arrays.sort(arr);
		System.out.println(arr.length);
		FindCycles(arr);

	}

	private static void FindCycles(int[] arr) {

		int min = arr[0];
		int counter = 0;

		int[] newArr = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[i] = arr[i] - min;
				if (arr[i] != 0) {

					newArr[j] = arr[i];
					j++;

				}
			}
		}
		for (int r = 0; r < newArr.length; r++) {

			if (newArr[r] > 0)
				counter++;

		}

		if (counter != 0) {
			System.out.println(counter);
			FindCycles(newArr);
		}
	}
}