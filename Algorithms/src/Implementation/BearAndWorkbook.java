package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BearAndWorkbook {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
    	int chapters = in.nextInt();
    	int problemsPerPage = in.nextInt();
    	int[] t = new int[chapters];
		for (int i = 0; i < chapters; i++) {
			t[i] = in.nextInt();

		}
		countSpecialProblems(chapters, problemsPerPage, t);
    }

	private static void countSpecialProblems(int chapters, int problemsPerPage, int[] t) {
			
		//Incomplete
		
	}
}