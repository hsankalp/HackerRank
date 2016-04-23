package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			EvenlyDivisibleDigits(n);
		}
	}

	private static void EvenlyDivisibleDigits(int n) {
		int num = n;
		int counter = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;

			if (digit != 0 && num % digit == 0) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
