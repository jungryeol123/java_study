package chapter04;
/*
 * 논리연산자 : &&(AND), ||(OR), !(NOT)
 * &&,|| 연산자는 앞의 식의 결과에 따라 Shortcut으로 진행됨
 */
public class OpLogicTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		//AND(&&) : 두 개의 항의 결과가 모두 true인 경우에만 실행결과가 true
		System.out.println((a > b) && (a == 10));
		System.out.println((a > b) && (b == 10));
		System.out.println((a < b) && (a == 10));				//Shortcut (a < b)가 이미 false이기 때문에 뒤에 연산은 하지않고 바로 결과를 낸다.
		System.out.println(((a < b) && (a == 10)) + "\n");		//Shortcut and 연산의 경우 false일 확률이 높은 연산을 먼저 앞에 적는다.(요즘엔 기기가 좋아서 의미 미미함)
		
		//OR(||) : 두 개의 항의 결과중 하나라도 true이면 실행결과가 true
		System.out.println((a > b) || (a == 10));				//Shortcut (a > b)가 이미 true이므로 뒤에 연산은 하지않고 바로 결과를 낸다.
		System.out.println((a > b) || (b == 10));				//Shortcut
		System.out.println((a < b) || (a == 10));
		System.out.println(((a < b) || (a == 10)) + "\n");
		
		//NOT(!) : 결과를 반대의 boolean 값으로 변경
		System.out.println(!(!(a > b) || !(a == 10)));
//		System.out.println(!a);  	//a는 int 타입으로 NOT 연산자가 적용되지 않음
	}
}
