package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q9 implements JavaQuestion {
	@Override
	public String solve() {
		Util.io().print("Type marks as percentages or '-1' to calculate", true);
		byte passes = 0;
		byte fails = 0;
		
		while(true) {
			byte o = Util.io().askByte(">>> "); // Get the next mark
			if(o<0) // If quit requested
				break;
			else if(o<50) // If a failed mark add 1 to the fail counter
				fails++;
			else // If a passing mark add 1 to the pass counter
				passes++;
		}
		return "Passes: "+passes+"\nFails: "+fails+"\n"; // Return the values
	}
	
	@Override
	public byte getId() {return 9;}
	@Override
	public String getName() {return "Question 9";}
}
