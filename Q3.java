package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q3 implements JavaQuestion {
	@Override
	public String solve() {
		short a = Util.io().askShort("a: ");
		short b = Util.io().askShort("b: ");
		short c = Util.io().askShort("c: "); // Get the values for the quadratic formula
		
		int ans = (b*b)-(4*a*c); // Calculate the stem of the quadratic formula
		if(ans<0)
			return "0"; // Print answer based on stem
		if(ans==0)
			return "1";
		return "2";
	}

	@Override
	public byte getId() {return 3;}
	@Override
	public String getName() {return "Question 3";}
}
