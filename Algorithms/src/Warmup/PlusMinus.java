package Warmup;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        calcFraction(arr);
    }

	private static void calcFraction(int[] arr) {
		
		float c1=0;
		float c2=0;
		float c3=0;
		
		for (int i = 0; i<arr.length; i++){
			
			if(arr[i]>0){
			c1++;	
			}
			else if (arr[i]<0){
			c2++;	
			}
			else{
			c3++;	
			}
			
		}
		NumberFormat formatter = new DecimalFormat("#0.000000");
		System.out.println(formatter.format(c1/arr.length));
		System.out.println(formatter.format(c2/arr.length));
		System.out.println(formatter.format(c3/arr.length));
	}
}
