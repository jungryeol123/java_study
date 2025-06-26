package chapter04;
/*
 *  사칙 연산자 : +, -, *, /, %
 */
public class OpArithmeticTest {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		System.out.println("num1 + num2 = " + (num1 + num2));		//접합연산자와 사칙연산자가 같이 있으면 접합연사자가 먼저 실행되므로 괄호로 묶어주면 사칙연산을 먼저한다.
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
	}
}
