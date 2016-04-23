package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			CalcChoc(n, c, m);
		}
	}

	private static void CalcChoc(int n, int c, int m) {

		int initChoc = n / c;
		int totalChoc = initChoc;
		if (initChoc < m) {
			System.out.println(initChoc);
		} else {
			findWrappers(totalChoc, initChoc, m);
		}
	}

	private static void findWrappers(int totalChoc, int initChoc, int m) {

		int a = initChoc / m;
		int b = initChoc % m;
		initChoc = a + b;
		totalChoc = totalChoc + a;
		if (initChoc >= m) {
			findWrappers(totalChoc, initChoc, m);
		} else {
			System.out.println(totalChoc);
		}
	}
}