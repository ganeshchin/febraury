package logicsnew.Examples;

import java.io.File;

public class Master {

	public static void main(String[] args) {
	File f=new File("D:\\jaaz");
	String[] files=f.list();
	for(int i=0;i<files.length;i++) {
		boolean b=files[i].contains("r");
		if(b==true) {
		System.out.println(files[i]);
		
	}
	}
}}
