package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            ClassCancelled(n,k,a);
        }
        
    }

	private static void ClassCancelled(int num, int thresh, int[] time) {
		
		int c1=0;
		
		for (int i = 0; i<time.length; i++){
			if (time[i]<=0){
				c1++;
			}
		}
		if (c1<thresh){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
