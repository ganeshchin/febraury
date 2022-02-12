package Examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student {

	public static void main(String[] args) throws IOException  {
		try {
			FileReader fr=new FileReader("D:\\Esception\\student.txt");
			
			BufferedReader br= new BufferedReader(fr);
			String str=  br.readLine();
			int count=0;
			int totalmarks=0;
			while(str !=null) {
//			System.out.println(str);
			String[] values=str.split(",");
			
//				System.out.println(values[3]);
				int marks=Integer.parseInt(values[3]); 
				totalmarks=totalmarks+marks;
				str=br.readLine();
			count++;
			System.out.println(totalmarks);
			}
			
//			System.out.println(count);
			} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
