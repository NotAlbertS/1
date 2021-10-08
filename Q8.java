package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q8 implements JavaQuestion {
	
	public final float TWOTHIRDS = (float) (2F/3F); // Get a constant of 2/3
	
	@Override
	public String solve() {
		float x = Util.io().askFloat("x: ");
		float y = Util.io().askFloat("y: "); // Get x and y
		
		while(x>y)
			x *= this.TWOTHIRDS; // Keep multiplying by 2/3
		
		return String.valueOf(x);
	}
	
	@Override
	public byte getId() {return 8;}
	@Override
	public String getName() {return "Question 8";}
}
