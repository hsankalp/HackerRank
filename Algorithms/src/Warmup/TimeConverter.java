package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		calcTime(time);
	}

	private static void calcTime(String time) {

		String search = "AM";

		if (time.indexOf(search) != -1) {
			if (time.substring(0, 2).equals("12")) {
				time = time.replace("12", "00");
			}
			time = time.replace(search, "");
			System.out.println(time);
		} else {
			if (time.substring(0, 2).equals("12")) {
				time = time.replace("PM", "");
				System.out.println(time);
			} else {
				int temp = Integer.parseInt(time.substring(0, 2)) + 12;
				String temp1 = Integer.toString(temp);
				time = time.replace(time.substring(0, 2), temp1);
				time = time.replace("PM", "");

				System.out.println(time);
			}
		}

	}
}
