package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q1 implements JavaQuestion {
	@Override
	public String solve() {
		double r = Util.io().askDouble("Radius: "); // Get the radius of the circle
		return String.valueOf(r*r*Math.PI); // Print the area of the circle
	}

	@Override
	public byte getId() {return 1;}
	@Override
	public String getName() {return "Question 1";}
}
