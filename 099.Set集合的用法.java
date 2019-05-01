/**
List和Set之间很重要的一个区别是是否允许重复元素的存在，在List中允许插入重复的元素，而在Set中不允许重复元素存在
*/
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
