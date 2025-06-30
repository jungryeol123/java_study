package chapter06;

public class ArrayTest03 {
	public static void main(String[] args) {
		// 1에서 100까지의 데이터를 입력 후 순서대로 저장 후 출력
		
//		int num[] = {1,2,3,4,5};
//		System.out.println(num[0]+"\n"+num[1]+"\n"+num[2]+"\n"+num[3]+"\n"+num[4]);

		int[] numbers = new int[28]; //배열의 전체 크기 : 변수명.length
		
		//데이터 저장
		for (int i = 0 ; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
		//데이터 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
