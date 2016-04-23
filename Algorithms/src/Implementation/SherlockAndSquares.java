package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			
			int a = in.nextInt();
			int b = in.nextInt();
			
			float start = System.currentTimeMillis();
			int count = 0;

			for (int i = 1; i*i <= b; i++) {

				if (i*i>=a)
					count++;
				
				//Incomplete

			}
			System.out.println(count);
			float end = System.currentTimeMillis();
			System.out.println(end-start);
		}
	}
}
