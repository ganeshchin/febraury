package corejava.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListSorting {
public static void main(String[] args) {
	List<String> al= new ArrayList<String>();
	al.add("Andhra");
	al.add("Belangana");
	al.add("Cune");
	al.add("ammai");
	al.add("chennai");
	al.add("babai");
	Collections.sort(al);
	for(int i=0;i<al.size();i++) { 
		System.out.println(al.get(i));
		
	}
	Enumeration<String> e = Collections.enumeration(al);
	 
    // Enumerate through the ArrayList elements
    System.out.println("ArrayList elements: ");
    while(e.hasMoreElements())
    System.out.println(e.nextElement());
    Iterator<String> iter = al.iterator();
    while (iter.hasNext()) {
       System.out.println(iter.next());
    } 
    
    
	ListIterator<String> namesIterator
    = al.listIterator();

// Traversing elements
while (namesIterator.hasNext()) {
    System.out.println(namesIterator.next());
}

}
}

