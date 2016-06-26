package array;

import java.util.Arrays;

public class Test_01 {
	public static void main(String[] args) {
//		int[] array1 = new int[]{10,20,30,40,50};
//		int[] array2 = new int[]{1,2,3,4,5,6,7};
//		System.arraycopy(array2, 4, array1, 0, 3);
//		for (int i : array1) {
//			System.out.println(i);
//		}
//		int[] temp = new int[array1.length];
//		for(int i=0; i < array1.length; i++){
//			temp[temp.length-1-i] = array1[i];
//		}
//		array1=temp;
//        for(int i:array1){
//        	System.out.println(i);
//        }
//		int[][] a= {{1,4},{2,5,7,9},{3,6,8}};
//		for(int i=0;i<a.length;i++){
//			for (int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		Student[] stus = new Student[4];
		stus[0] = new Student();
		stus[0].setAge(18);
		stus[1] = new Student();
		stus[1].setAge(11);
		stus[2] = new Student();
		stus[2].setAge(15);
		stus[3] = new Student();
		stus[3].setAge(9);
		Arrays.sort(stus);
		for (Student s: stus) {
			System.out.println(s.getAge());
		}
		
	}

}

