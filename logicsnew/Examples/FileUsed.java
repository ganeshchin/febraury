package logicsnew.Examples;
import java.io.FileReader;


public class FileUsed {

	
	public static void main(String[] args) {

		try {
		FileReader fr =new FileReader("D:\\Esception\\gewr.txt");
	int ch=fr.read();
	int count=0;
	while(ch !=-1) {
		System.out.print((char)ch);
		 
		 if(ch>65 & ch<90 | ch>=97 & ch<=122)
		 {
		count++;
		}
		 ch=fr.read();
	}

		System.out.println(count);}
		catch(Exception e) {
			System.out.println("hi");
			
		}
	}
}
