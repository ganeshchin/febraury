package logicsnew.DataStructures;

public class Test8 {

	public static void main(String[] args) {
	String sr="hello iam from slokam";
String[] values=sr.split(" ");
for(int i=0;i<values.length;i++) {
	if(values[i].startsWith("t")) {
System.out.println(values[i]);	
}
	else {
		System.out.println("there is no value with t");
	}	
	}
}

}
