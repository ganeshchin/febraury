package logicsnew.DataStructures;

public class Test7 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,78,};
		int[] arr2=new int[6];
//		arr2[0]=arr1[0];
//		arr2[1]=arr1[1];
//		arr2[2]=arr1[2];
//		arr2[3]=arr1[3];
//		arr2[4]=arr1[4];
//		arr2[5]=arr1[5];
////		arr2[6]=arr1[6];
		for(int j=arr2.length-1;j>0;j--) {
			arr2[j]=arr1[j];
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		}

	}

