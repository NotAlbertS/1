package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q4 implements JavaQuestion {
	@Override
	public String solve() {
		short a = Util.io().askShort("Num 1: ");
		short b = Util.io().askShort("Num 2: "); // Get the numbers
		
		if(a==b)
			return String.valueOf(a); // If the are equal they are the GCF
		
		if(a<b) {
			if(div(a, b))
				return String.valueOf(a); // If a is a factor of b
			
			for(short i=a;i>1;i--)
				if(div(a, i)&&div(b, i))
					return String.valueOf(i); // Loop until you find the GCF
		
		} else {
			if(div(b, a))
				return String.valueOf(b); // Reverse of above
			
			for(short i=b;i>1;i--)
				if(div(a, i)&&div(b, i))
					return String.valueOf(i);
		}
		return "1"; // If there is no GCF return 1
	}
	
	public static boolean div(short a, short b) {
		short ds = (short) (a/b);
		float df = ((float) a) / ((float) b);
		return ds==df;
	}

	@Override
	public byte getId() {return 4;}
	@Override
	public String getName() {return "Question 4";}
}
