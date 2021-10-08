package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q6 implements JavaQuestion {
	@Override
	public String solve() {
		String n = Util.io().ask("Number: "); // Get the number
		short sum = 0;
		
		for(int i=0;i<n.length();i++)
			sum += Byte.valueOf(n.substring(i, i+1)); // For each digit add it
		return String.valueOf(sum); // Return the sum
	}
	
	@Override
	public byte getId() {return 6;}
	@Override
	public String getName() {return "Question 6";}

}
