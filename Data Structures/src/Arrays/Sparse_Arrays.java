package Arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sparse_Arrays {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];
		for (int str_i = 0; str_i < n; str_i++) {
			str[str_i] = in.next();

		}

		int q = in.nextInt();
		String[] queries = new String[q];
		for (int q_i = 0; q_i < q; q_i++) {
			queries[q_i] = in.next();
		}

		for (int i = 0; i < q; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {

				if (str[j].equals(queries[i])) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}