package chapter04;
/*
 * 비교연사자 : >, >=, <, <=, ==, !=
 * 비교연산자의 실행결과는 boolean 타입으로 리턴되며, 제어문 if, while조건식에 사용됨
 */
public class OpComparisonTest {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		boolean result = num1 == num2;
		
		System.out.println(result + "\n\n\n" );
		
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

	}

}
