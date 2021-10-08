package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q10 implements JavaQuestion {
	@Override
	public String solve() {
		int n = Util.io().askInt("N: "); // Get the value of n
		if(n==1)
			return "10000"; // Print 10000 if there is a series of 1
		int fac;
		if(isEven(n))
			fac =  (n+1)*(n/2); // Get the value of 1+2+3+...+n
		else
			fac = ((n+1)*(n/2))+((n+1)/2);
		float x = (float) (10000-fac);
		x = x/n; // Calculate the smallest number in the series
		if(x==(int) x) { // If the number is valid (whole)
			String out = "";
			for(int i=0;i<n;i++)
				out = out+(int) (x+i)+", "; // Format the list of consecutive numbers
			out = out.substring(0, out.length()-2); // Remove the final ", " from the list
			return out; // Print the list
		}
		return "None";
	}
	
	@Override
	public byte getId() {return 10;}
	@Override
	public String getName() {return "Question 10";}
	
	public static boolean isEven(int b) {
		float o = (float) b;
		float d = o/2;
		short s = (short) (o/2);
		return d==(float) s;
	}
}
