package com.x.hi;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;
import com.x.schoolhelper.util.UtilString;

public class Q2 implements JavaQuestion {
	
	public static final String pass = "XohImNooBHFR0OVvP8YpJ3NgPQ1qq73WKhHvch0VQtg="; // SHA-256 and Base64 for 'password'
	
	@Override
	public String solve() {
		Util.io().print("Hint: password", true);
		for(int i=0;i<3;i++) { // Loop 3 times for 3 attempts
			String a = Util.io().ask("Password: "); // Get the password attempt
			UtilString s = Util.string();
			a = s.btoa(s.SHA256(a)); // Hash the attempt and convert it to Base64
			if(a.equals(pass)) // Compare the password to the expected password
				return "CORRECT PASSWORD"; // If the password is correct
			else
				Util.io().print("INCORRECT PASSWORD", true); // If the password is incorrect
		}
		return "LOGIN DENIED"; // If you run out of attempts
	}

	@Override
	public byte getId() {return 2;}
	@Override
	public String getName() {return "Question 2";}
}
