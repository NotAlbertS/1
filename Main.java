package com.x.hi;

import com.x.schoolhelper.Question;
import com.x.schoolhelper.util.Util;

public class Main {
		
	public static void main(String[] args) {
		Question.registerQuestion(new Q1());
		Question.registerQuestion(new Q2());
		Question.registerQuestion(new Q3());
		Question.registerQuestion(new Q4());
		Question.registerQuestion(new Q5());
		Question.registerQuestion(new Q6());
		Question.registerQuestion(new Q7());
		Question.registerQuestion(new Q8());
		Question.registerQuestion(new Q9());
		Question.registerQuestion(new Q10());
		
		while(true) {
			String q = Util.io().ask("Question number (1-10) or e to exit: ");
			if(q.equalsIgnoreCase("e"))
				break;
			byte p = Byte.valueOf(q);
			Question.printAsk(p);
			Util.gc();
		}
	}
	
}