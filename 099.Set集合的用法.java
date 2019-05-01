package p;

import java.util.HashSet;
import java.util.Set;

public class Main {


	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("h");
		set.add("e");
		set.add(null);
		set.add("l");
		set.add("l");
		set.add("o");
		System.out.println(set);
		for (String s:set) {
			System.out.println(s);
		}
	}
}

/**
[null, e, h, l, o]
null
e
h
l
o
 */
