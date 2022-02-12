package corejava.basics;
import java.util.ArrayList;
import java.util.Arrays;    
class TestArrayList21{    
 public static void main(String args[]) {
//  List<String> al=new ArrayList<String>();    
//  al.add("Sonoo");  
//  al.add("Michael"); 
//  al.add("James");   
//  al.add("Andy");
  
  ArrayList<String> namesList
	= new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );

namesList.forEach(name -> System.out.println(name));
  
  
  
//  Iterator<String> itr=al.iterator();
//  while(itr.hasNext()){
//   System.out.println(itr.next());
//  }    
 }    
}   