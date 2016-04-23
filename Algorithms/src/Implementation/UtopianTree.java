package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			HeightOfTree(n);
		}

	}

	private static void HeightOfTree(int n) {

		int height = 1;
		if (n == 0)
			System.out.println(height);
		else {
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					height = height * 2;
				}
				if (i % 2 == 0) {
					height = height + 1;
				}
			}
			System.out.println(height);
		}
	}
}
