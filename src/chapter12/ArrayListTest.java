package chapter12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("홍길동");
//		list2.add(123); //제너릭으로 String타입을 받기로 했으므로 int값은 들어갈 수 없다
		list2.add(String.valueOf(123)); //int값을 String 값으로 변환
		list2.set(0, "이순신");  //리스트 0번지값 수정
		list2.add(1,"김유신");
		list2.remove(2);	   //삭제
		
		
		for(String str:list2) {
			System.out.println(str);
		}
		
		
		
		System.out.println(list.size()); //채워진 공간수 만큼
		
		list.add(100);
		list.add(new String("홍길동"));
		list.add(123.456);
		list.add(new Scanner(System.in));
		
		System.out.println(list.size()); //채워진 공간수 만큼
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3)); //리스트는 get()메소드를 통해 값을 가져온다.
		
		
		
		
		
		
		
		
		
		
		
	}

}
