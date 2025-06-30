package chapter06;

import java.util.Scanner;

public class ArrayTest04 {
	public static void main(String[]args) {
		//배열 객체 생성 후 크기 확인 : 기본형 데이터를 저장하는 객체 생성
		int[] numberList = new int[5];
		String[] nameList = {"홍길동", "이순신", "김유신"};
		boolean[] flagList = new boolean[2];
		
		//배열 객체 생성 후 크기 확인 : 참조 데이터를 저장하는 객체 생성
		Scanner[] scanList = new Scanner[3]; //Scanner 클래스의 객체를 3개 저장
		
		//scanList 0번지에 Scanner 객체 생성 후 주소 저장
		
		scanList[0] = new Scanner(System.in);
		scanList[1] = new Scanner(System.in);
		scanList[2] = new Scanner(System.in);
		
		System.out.println(numberList.length);
		System.out.println(nameList.length);
		System.out.println(flagList.length);
		System.out.println(scanList.length);
		System.out.println("\n");
		System.out.println(scanList[0]);
		System.out.println(scanList[1]);
		System.out.println(scanList[2]);
		System.out.println("\n");
		System.out.println(scanList[0].hashCode()); // 값이 다 다르므로 각각 다른 새로운 객체인 것을 확인할 수 있다.
		System.out.println(scanList[1].hashCode()); // call by reference
		System.out.println(scanList[2].hashCode());
		System.out.println("\n");
		scanList[0] = scanList[2];
		System.out.println(scanList[0].hashCode()); // .ha shCode() : 생성되어져 있는 객체의 주소 확인
		System.out.println(scanList[1].hashCode());
		System.out.println(scanList[2].hashCode());
		System.out.println("\n");
		
		int[] nList = new int[3];
		nList[0] = 10;
		nList[1] = 20;
		nList[2] = 30;
		
		nList[0] = nList[2];
		System.out.println(nList[0]);  //nlist는 Heap에서 기본형으로 생성되어져 있기 때문에 .hashCode()를 쓸 수 없다.
		System.out.println(nList[1]);  //call by value
		System.out.println(nList[2]);
		
	}
}
