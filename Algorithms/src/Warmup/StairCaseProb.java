package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StairCaseProb {
	
	static void StairCase(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			for (int k = i; k <= n; k++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int _n;
		_n = Integer.parseInt(in.nextLine().trim());

		StairCase(_n);

	}
}
