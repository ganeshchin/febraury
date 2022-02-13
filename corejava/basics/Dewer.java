package corejava.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import corejava.basics.sorting.Employee;
// java8 iteration
// max age
//min age 
//averaeg age
//name count
//age 30  tho enthamandhi unnaru count
//match related anymatch all match
// sorting 
//optional
public class Dewer {
public static void main(String[] args) {
	Employee e= new Employee("suresh", 23);
	Employee e1= new Employee("ramesh", 23);
	Employee e3= new Employee("magesh", 31);
	Employee e2= new Employee("vathav", 30);
	Employee e4= new Employee("vaibhav", 23);
	Employee e8= new Employee("vaibhav", 23);
	Employee e5= new Employee("savitha", 23);
	Employee e6= new Employee("yudi", 30);
	Employee e7= new Employee("stir", 30);
	
	List<Employee> arr=new ArrayList<Employee>();
	arr.add(e);
	arr.add(e1);
	arr.add(e2);
	arr.add(e3);
	arr.add(e4);
	arr.add(e5);
	arr.add(e6);
	arr.add(e7);
	arr.add(e8);
	Collections.sort(arr);
	Iterator<Employee> itr =  arr.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}

}
