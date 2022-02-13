package corejava.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting1 {
	public static void main(String[] args) {
		List<Integer> al= new ArrayList<Integer>();
		al.add(1);
		al.add(234);
		al.add(23);
		al.add(656);
		al.add(234);
		al.add(678);
		Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
	}

}
