package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q5 implements JavaQuestion {
	@Override
	public String solve() {
		
		short a = Util.io().askShort("a: ");
		short b = Util.io().askShort("b: "); // Get the numbers
		
		return toYN(Q4.div(a, b)); // Print if b is a multiple of a (a is a factor of b)
	}

	@Override
	public byte getId() {return 5;}
	@Override
	public String getName() {return "Question 5";}
	
	public static String toYN(boolean bool) { // Turn a boolean into yes or no
		if(bool)
			return "Yes";
		return "No";
	}
}
