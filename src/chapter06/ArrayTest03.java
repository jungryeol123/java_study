package chapter06;

public class ArrayTest03 {
	public static void main(String[] args) {
		// 1에서 100까지의 데이터를 입력 후 순서대로 저장 후 출력
		
//		int num[] = {1,2,3,4,5};
//		System.out.println(num[0]+"\n"+num[1]+"\n"+num[2]+"\n"+num[3]+"\n"+num[4]);

		int[] numbers = new int[100];
		
		for (int i = 0 ; i < 100; i++) {
			numbers[i] = i + 1;
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(numbers[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
