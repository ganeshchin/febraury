package logics;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		Double marks=sc.nextDouble();
		if(age>=17 && age<=21) {	
			if(marks>=80) {
				System.out.println("iam");
				
			}
			else {
				System.out.println("no age");
			}
			
		}
		else {
			System.out.println("hi");
		}
		
		

	}

}
