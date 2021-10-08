package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q7 implements JavaQuestion {
	@Override
	public String solve() {
		short s = Util.io().askShort("N: "); // Get n
		if(s==1||s==2)
			return "1";
		
		int n1 = 1;
		int n2 = 1;
		int tmp = 0;
		
		for(int i=1;i<s;i++) { // Get the next number in the fibonacci sequence until it is the nth number
			tmp = n1+n2;
			n2 = n1;
			n1 = tmp;
		}
		
		return String.valueOf(n2); // Return the result
	}
	
	@Override
	public byte getId() {return 7;}
	@Override
	public String getName() {return "Question 7";}
}
