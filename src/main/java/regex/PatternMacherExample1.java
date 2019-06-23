package regex;

import java.util.regex.Pattern;

public class PatternMacherExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[amn]?", "amn"));
		System.out.println(Pattern.matches("[amn]", "a"));
	}

}
