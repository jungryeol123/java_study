package chapter06;

public class ArrayTest02 {
	public static void main(String[] args) {
		// names 문자열 변수 선언 및 생성
		String[] names;
		String names2[];
		
		names = new String[3];
		names2 = new String[5];
		
		int[] scores = new int[10];
//		int scores2[] = new double[10]; 데이터타입을 맞추지 않았기때문에 오류가 남
		int scores3[] = {10, 20, 30};
		String names3[] = {"홍길동", "홍길순"};
		
		//names 2번째 공간에 "이순신" 저장
		names[1] = "이순신";
		
		int[] scores4 = new int[3];

		System.out.println(scores3[0]);
		System.out.println(scores4[0]);
		System.out.println(names[0]);
		
		String str = new String("홍길동");
		System.out.println(str);
		
		names[0] = "홍길동";
		System.out.println(names[0]);
		names[1] = "이순신";
		System.out.println(names[1]);
		
		scores[0] = 100;
		scores[1] = 200;
		scores[2] = 300;
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[0]+scores[1]+scores[2]);
		System.out.println(names[1]);
		
		
		
		
		
		
		
		
		
	} // method
} // main 
