package DataStructures;

public class Test6 {

	public static void main(String[] args) {
int arr[]= {5,6,7,8,9,12,34,89,98,56};
int b=arr[0];
for(int i=1;i<arr.length;i++) {
	if(b<arr[i]) {
		b=arr[i];
		
	}
	
}
System.out.println(b);

	}

}
