package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		CalcDiff(a);
	}

	private static void CalcDiff(int[][] a) {

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a[i].length; j++) {
				if (j == i) {
					sum1 = sum1 + a[i][j];
				}
			}

		}
		int j = a.length - 1;
		for (int i = 0; i < a.length; i++) {

			sum2 = sum2 + a[i][j];
			j--;

		}
		System.out.println(Math.abs(sum2-sum1));
		
	}
}
