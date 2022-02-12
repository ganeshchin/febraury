package logics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example7 {

	public static void main(String[] args) {
List<String> al=new ArrayList<String>();
al.add("elephant");
al.add("manoho");
al.add("guiop");
System.out.println(al);
Iterator<String> set=al.iterator();
boolean b=set.hasNext();
if(b)
System.out.println(al);
else
	System.out.println("no value is present");
	}

}
