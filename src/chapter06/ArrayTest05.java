package chapter06;

public class ArrayTest05 {
	public static void main(String[] args) {
		int[] nList = new int[3];
//		nList[0] = "1";   Type mismatch
		
//		nList[3] = 99;    컴파일(Runtime시) 할 때 ArrayIndexOutOfException 발생
		nList[2] = 99;
		
		
		
		System.out.println(nList.hashCode());
		System.out.println(nList[2]);
		
		for (int i = 0; i < nList.length; i++ ) {
			System.out.println(nList[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
