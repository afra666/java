package p;
import java.util.Vector;
public class TestClass {
 
   public static void main(String args[]) {
   Vector<String> v=new Vector<String>(); 
    System.out.println(v);
	v.addElement("one"); 
	System.out.println(v);
	v.addElement("two"); 
	System.out.println(v);
	v.addElement("three"); 
	System.out.println(v);
	v.insertElementAt("zero",0); 
	System.out.println(v);
	v.insertElementAt("oop",3); 
	System.out.println(v);
	v.setElementAt("three",3); 
	System.out.println(v);
	v.setElementAt("four",4); 
	System.out.println(v);
	
	System.out.println(v.get(0));
	
	v.removeAllElements(); 
	System.out.println(v);
   }
}
/**
[]
[one]
[one, two]
[one, two, three]
[zero, one, two, three]
[zero, one, two, oop, three]
[zero, one, two, three, three]
[zero, one, two, three, four]
zero
[]
 */	
